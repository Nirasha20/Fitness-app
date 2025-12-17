package com.example.activityservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  
@RestController
@RequestMapping("/api/activities")
@AllArgsConstructor
public class ActivityContoller {

    private ActivityService activityService;

    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest request) {
        // Implementation for tracking activity
        return ResponseEntity.ok(activityService.trackActivity(request));

    }
}

