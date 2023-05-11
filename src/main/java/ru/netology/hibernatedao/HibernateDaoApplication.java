package ru.netology.hibernatedao;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateDaoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HibernateDaoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
