package com.example.schedule.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author gsliu
 * @date 2018-08-02 9:07
 */
@Component
public class ScheduleService {
    private final Logger logger = LoggerFactory.getLogger(ScheduleService.class);

    @Scheduled
    public void excuteSchedule(){

    }



}
