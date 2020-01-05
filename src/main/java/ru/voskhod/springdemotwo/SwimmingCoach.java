package ru.voskhod.springdemotwo;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim all day";
    }
}
