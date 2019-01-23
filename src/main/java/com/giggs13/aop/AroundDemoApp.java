package com.giggs13.aop;

import com.giggs13.aop.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService trafficFortuneService = context.getBean(TrafficFortuneService.class);

        String data = trafficFortuneService.getFortune();
        System.out.println("\nMy fortune is: " + data);

        System.out.println("\nMain Program is finished");

        context.close();
    }
}
