package br.com.viaapia.analystnotebook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitializerdbController {
    @PostMapping("/initializerdb")
    public ResponseEntity<?> initializeDatabase() {
        // Implement your database initialization logic here
        return ResponseEntity.ok("Database initialized successfully");
    }
}
