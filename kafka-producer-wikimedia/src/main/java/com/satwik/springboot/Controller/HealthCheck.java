package com.satwik.springboot.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/check-health/")
    public ResponseEntity<String> healthCheck()
    {
        return new ResponseEntity<>("Getting called successfully.", HttpStatus.OK);
    }
}