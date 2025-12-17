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

        Activity activity= Activity.builder()
                .userId(request.getUserId())
                .type(request.getType())
                .duration(request.getDuration())
                .caloriesBurned(request.getCaloriesBurned())
                .startTime(request.getStartTime())
                .addtionalMetrics(request.getAddtionalMetrics())
                .build();
        Activity savedActivity = activityRepository.save(activity);
        return mapToResponse(activity);

}
private ActivityResponce mapToResponse(Activity activity){
    Activityresponse response = new ActivityResponse();
    response.setId(activity.getId());
    response.setUserId(activity.getUserId());
    response.setType(activity.getType());
    response.setDuration(activity.getDuration());
    response.setCaloriesBurned(activity.getCaloriesBurned());
    response.setStartTime(activity.getStartTime());
    response.setAddtionalMetrics(activity.getAddtionalMetrics());
    response.setCreatedAt(activity.getCreatedAt());
    response.setUpdatedAt(activity.getUpdatedAt());
    return response;

}