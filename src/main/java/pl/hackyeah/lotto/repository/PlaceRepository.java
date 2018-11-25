package pl.hackyeah.lotto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hackyeah.lotto.model.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}