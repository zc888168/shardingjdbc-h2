package com.example.demo;

import com.iflytek.DemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackageClasses = {DemoApplicationTest.class, DemoApplication.class})
public class DemoApplicationTest extends SpringBootServletInitializer {


    /**
     * main run
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplicationTest.class, args);
    }
}
