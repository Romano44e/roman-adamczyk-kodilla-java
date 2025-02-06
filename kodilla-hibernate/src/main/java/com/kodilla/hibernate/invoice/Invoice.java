package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {

    private int id;
    private String Number;
    private List<Item> itemsI = new ArrayList<Item>();

    public Invoice() {
    }

    public Invoice(String number) {
        Number = number;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "NUMBER")
    public String getNumber() {
        return Number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    public List<Item> getItemsI() {
        return itemsI;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public void setItemsI(List<Item> itemsI) {
        this.itemsI = itemsI;
    }
}
