package ru.voskhod.springdemotwo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return null;
    }
}
