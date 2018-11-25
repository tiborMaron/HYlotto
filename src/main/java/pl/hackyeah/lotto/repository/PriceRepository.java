package pl.hackyeah.lotto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hackyeah.lotto.model.Price;

public interface PriceRepository extends JpaRepository<Price, Long> {
}