package com.example.donateservice.controller;

import com.example.donateservice.model.Donate;
import com.example.donateservice.repository.DonateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
public class DonateController {

    @Autowired
    private DonateRepository donateRepository;

    @GetMapping
    public List<Donate> getAllDonations() {
        return donateRepository.findAll();
    }

    @PostMapping
    public Donate createDonation(@RequestBody Donate donate) {
        return donateRepository.save(donate);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Donate> getDonationById(@PathVariable Long id) {
        Donate donate = donateRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Donation not found with id: " + id));
        return ResponseEntity.ok(donate);
    }
}
