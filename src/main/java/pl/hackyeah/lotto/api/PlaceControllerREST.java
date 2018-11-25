package pl.hackyeah.lotto.api;

import org.springframework.web.bind.annotation.*;
import pl.hackyeah.lotto.model.Place;
import pl.hackyeah.lotto.repository.PlaceRepository;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PlaceControllerREST {
    private PlaceRepository placeRepository;

    public PlaceControllerREST(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @RequestMapping(value = "/places", method = RequestMethod.GET)
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    @RequestMapping(value = "/place/{id}", method = RequestMethod.GET)
    public Optional<Place> getPlaceByID(@PathVariable("id") Long id) {
        return placeRepository.findById(id);
    }
}