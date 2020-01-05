package ru.voskhod.springdemotwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Swim all day";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }


}
