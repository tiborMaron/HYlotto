package pl.hackyeah.lotto.model;

import javax.persistence.*;

@Entity
public class Prize {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private int quantity;

    public Prize() {
    }

    public Prize(String name, int quantity, Place occurence) {
        this.name = name;
        this.quantity = quantity;
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
}