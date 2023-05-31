package com.example.CronTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "* */5 * * * * ")
    public void schedule(){
        System.out.println("Hello World");
    }
}
