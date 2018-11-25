package pl.hackyeah.lotto.api;

import org.springframework.web.bind.annotation.*;
import pl.hackyeah.lotto.model.Price;
import pl.hackyeah.lotto.repository.PriceRepository;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PriceControllerREST {

    private PriceRepository priceRepository;

    public PriceControllerREST(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @RequestMapping(value = "/prices", method = RequestMethod.GET)
    public List<Price> getAllPrices() {
        return priceRepository.findAll();
    }

    @RequestMapping(value = "/price/{id}", method = RequestMethod.GET)
    public Optional<Price> getPriceByID(@PathVariable("id") Long id) {
        return priceRepository.findById(id);
    }
}