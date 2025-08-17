package org.example.financetracker.controller;

import org.example.financetracker.model.Entry;
import org.example.financetracker.repository.EntryRepository;
import org.example.financetracker.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {

    @Autowired
    private EntryService entryService;


   @PostMapping("/addentry")
   public Entry postDetails(@RequestBody Entry entry ) {
        return entryService.addEntry(entry);
   }
}
