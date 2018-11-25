package pl.hackyeah.lotto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import pl.hackyeah.lotto.model.Place;

@Component
public interface PlaceRepository extends JpaRepository<Place, Long> {
}