package org.example.financetracker.service;

import org.example.financetracker.model.Entry;
import org.example.financetracker.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService {

    @Autowired
    EntryRepository entryRepository;

    public List<Entry> getEntries(){
        return entryRepository.findAll();

    }
    public Entry getEntryById(int id){
        return entryRepository.findById(id).orElse(new Entry());
    }

    public Entry addEntry(Entry entry){
        return entryRepository.save(entry);
    }
    public void updateEntry(Entry entry){
        entryRepository.save(entry);
    }
    public void deleteEntryById(int id){
        entryRepository.deleteById(id);
    }



}
