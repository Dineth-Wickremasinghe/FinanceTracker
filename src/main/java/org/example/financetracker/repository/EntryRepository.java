package org.example.financetracker.repository;

import jdk.jfr.Event;
import org.example.financetracker.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Integer> {



}
