package ru.voskhod.springdemotwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MyRandomFortuneService implements FortuneService {

    private String fortuneOne;

    private String fortuneTwo;

    private String fortuneThree;

    @Autowired
    public MyRandomFortuneService(
            @Value("${fortune.one}") String fortuneOne,
            @Value("${fortune.two}") String fortuneTwo,
            @Value("${fortune.three}") String fortuneThree
    ) {
        this.fortuneOne = fortuneOne;
        this.fortuneTwo = fortuneTwo;
        this.fortuneThree = fortuneThree;
    }

    @Override
    public String getDailyFortune() {
        String[] fortunes = {
                fortuneOne,
                fortuneTwo,
                fortuneThree
        };

        return fortunes[new Random().nextInt(fortunes.length)];
    }
}
