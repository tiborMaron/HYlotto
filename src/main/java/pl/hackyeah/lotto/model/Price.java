package pl.hackyeah.lotto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Entity
public class Price {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String description;

    private int quantity;

    @ManyToOne
    private Place occurence;

    public Price(String name, String description, int quantity, Place occurence) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.occurence = occurence;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Place getOccurence() {
        return occurence;
    }

    public void setOccurence(Place occurence) {
        this.occurence = occurence;
    }
}