package com.example.activityservice.service;

import com.example.activityservice.dto.ActivityRequest;
import com.example.activityservice.dto.ActivityResponse;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import com.example.activityservice.ActivityRepository;

@Service
@RequiredArgsConstructor
public class ActivityService {
    private ActivityRepository activityRepository;

    public ActivityResponse trackActivity(ActivityRequest request) {
        return new ActivityResponse();
}

}