package pl.hackyeah.lotto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hackyeah.lotto.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}