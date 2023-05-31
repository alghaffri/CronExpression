package com.example.CronTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "* 0,30 18-23 * * 0-4")
    public void Schedule(){
        System.out.println("Hello World");
    }


}
