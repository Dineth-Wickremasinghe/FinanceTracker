package org.example.financetracker.repository;


import org.example.financetracker.model.Entry;


public interface Demo_Repository {
    public void save(Entry entry);

    public Entry findEventById(String id);
}
