package com.satwik.consumer.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
public class HealthCheck {

    @GetMapping("/check-health")
    public ResponseEntity<String> healthCheck()
    {
        return new ResponseEntity<>("Getting called successfully.", HttpStatus.OK);
    }
}