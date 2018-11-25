package pl.hackyeah.lotto.api;

import org.springframework.web.bind.annotation.*;
import pl.hackyeah.lotto.model.Customer;
import pl.hackyeah.lotto.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class CustomerControllerREST {

    private CustomerRepository customerRepository;

    public CustomerControllerREST(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public Optional<Customer> getCustomerByID(@PathVariable("id") Long id) {
        return customerRepository.findById(id);
    }
}
