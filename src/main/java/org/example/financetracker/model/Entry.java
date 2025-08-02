package org.example.financetracker.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table (name= "entry_db")
@Data
public class Entry {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="ID")
    private int id;

    @Column(name="Name")
    private String name;

    @Column(name="Amount")

    private double amount;

    @Column(name="Date")
    private String date;

    public Entry(int id, String name, double amount, String date) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    public Entry() {

    }



    @Override
    public String toString() {
        return "Entry{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}


