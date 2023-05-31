package com.example.CronTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 */5 9-17 * * 6-7")
    public void Schedule(){
        System.out.println("Hello World");
    }


}
