package pl.hackyeah.lotto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import pl.hackyeah.lotto.model.Customer;

@Component
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}