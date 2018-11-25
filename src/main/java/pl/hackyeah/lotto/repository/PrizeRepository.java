package pl.hackyeah.lotto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import pl.hackyeah.lotto.model.Prize;

@Component
public interface PrizeRepository extends JpaRepository<Prize, Long> {
}