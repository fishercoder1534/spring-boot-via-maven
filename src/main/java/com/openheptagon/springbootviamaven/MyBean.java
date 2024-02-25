package com.openheptagon.springbootviamaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    @Value("#{'${num}'.split(',')[1]}")
    private Integer num;

    @Autowired
    public MyBean(ApplicationArguments args) {
        System.out.println("Entered MyBean constructor now");
        try {
            System.out.println(args.getOptionValues("num").get(0) + num);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        System.out.println("Exiting MyBean constructor now");
    }
}
