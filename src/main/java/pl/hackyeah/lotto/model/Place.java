package pl.hackyeah.lotto.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Place {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private boolean isSponsored;

    private double longitude;
    private double latitude;

    @OneToMany(mappedBy = "occurence", cascade = CascadeType.ALL)
    private List<Price> prices;

    public Place(String name, boolean isSponsored) {
        this.name = name;
        this.isSponsored = isSponsored;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSponsored() {
        return isSponsored;
    }

    public void setSponsored(boolean sponsored) {
        isSponsored = sponsored;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }
}
