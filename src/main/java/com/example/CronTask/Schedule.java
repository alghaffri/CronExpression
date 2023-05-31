package com.example.CronTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "* 0 0 1 1,4,7,10 *")
    public void Schedule(){
        System.out.println("Hello World");


    }


}
