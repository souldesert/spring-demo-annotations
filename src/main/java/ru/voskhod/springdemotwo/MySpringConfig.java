package ru.voskhod.springdemotwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfig {

    @Bean
    FortuneService napFortuneService() {
        return new NapFortuneService();
    }

    @Bean
    Coach golfCoach() {
        return new GolfCoach(napFortuneService());
    }

}
