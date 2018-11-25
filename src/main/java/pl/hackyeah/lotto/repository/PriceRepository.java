package pl.hackyeah.lotto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import pl.hackyeah.lotto.model.Price;

@Component
public interface PriceRepository extends JpaRepository<Price, Long> {
}