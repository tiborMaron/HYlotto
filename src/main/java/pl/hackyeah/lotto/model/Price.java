package pl.hackyeah.lotto.model;

import javax.persistence.*;

@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private int quantity;

    @ManyToOne
    private Place occurence;

    public Price(String name, int quantity, Place occurence) {
        this.name = name;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Place getOccurence() {
        return occurence;
    }
}