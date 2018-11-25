package pl.hackyeah.lotto.api;

import org.springframework.web.bind.annotation.*;
import pl.hackyeah.lotto.model.Prize;
import pl.hackyeah.lotto.repository.PrizeRepository;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PrizeControllerREST {

    private PrizeRepository prizeRepository;

    public PrizeControllerREST(PrizeRepository prizeRepository) {
        this.prizeRepository = prizeRepository;
    }

    @RequestMapping(value = "/prizes", method = RequestMethod.GET)
    public List<Prize> getAllPrizes() {
        return prizeRepository.findAll();
    }

    @RequestMapping(value = "/prize/{id}", method = RequestMethod.GET)
    public Optional<Prize> getPriceByID(@PathVariable("id") Long id) {
        return prizeRepository.findById(id);
    }
}