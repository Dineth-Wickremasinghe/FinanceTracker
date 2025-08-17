package org.example.financetracker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table (name= "entry_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
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


