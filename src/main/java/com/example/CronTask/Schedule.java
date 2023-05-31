package com.example.CronTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "* 30 17 1 * *")
    public void Schedule(){
        System.out.println("Hello World");


    }


}
