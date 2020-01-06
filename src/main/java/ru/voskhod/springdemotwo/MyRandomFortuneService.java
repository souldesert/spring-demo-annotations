package ru.voskhod.springdemotwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

@Component
public class MyRandomFortuneService implements FortuneService {

    private String[] fortunes = new String[3];

//    @Autowired
//    public MyRandomFortuneService(
//            @Value("${fortune.one}") String fortuneOne,
//            @Value("${fortune.two}") String fortuneTwo,
//            @Value("${fortune.three}") String fortuneThree
//    ) {
//        this.fortuneOne = fortuneOne;
//        this.fortuneTwo = fortuneTwo;
//        this.fortuneThree = fortuneThree;
//    }

    @PostConstruct
    public void readFortunes() {
        try (InputStream input = this.getClass().getClassLoader().getResourceAsStream("sport.properties")) {
            Properties properties = new Properties();
            if (input != null) {
                properties.load(input);
            } else {
                throw new FileNotFoundException();
            }

            fortunes[0] = properties.getProperty("fortune.one");
            fortunes[1] = properties.getProperty("fortune.two");
            fortunes[2] = properties.getProperty("fortune.three");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getDailyFortune() {
        return fortunes[new Random().nextInt(fortunes.length)];
    }
}
