package pl.hackyeah.lotto.service;

import org.springframework.stereotype.Component;
import pl.hackyeah.lotto.model.Customer;
import pl.hackyeah.lotto.model.Place;
import pl.hackyeah.lotto.model.Prize;
import pl.hackyeah.lotto.repository.CustomerRepository;
import pl.hackyeah.lotto.repository.PlaceRepository;
import pl.hackyeah.lotto.repository.PrizeRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class DBInitializer {

    public DBInitializer(CustomerRepository customerRepository, PlaceRepository placeRepository, PrizeRepository prizeRepository) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        customerRepository.save(new Customer("Tibor", "Maron", sdf.parse("1997-08-06")));
        customerRepository.save(new Customer("Milán", "Kiszely", sdf.parse("1998-11-14")));

        Place sheesha = new Place("Sheesha Lounge", true, 52.229780, 21.013901);
        sheesha.getPrices().add(new Prize("Money", 500, sheesha));
        sheesha.getPrices().add(new Prize("Ticket", 3, sheesha));
        sheesha.getPrices().add(new Prize("Shisha Fruit", 1, sheesha));
        placeRepository.save(sheesha);

    }
}