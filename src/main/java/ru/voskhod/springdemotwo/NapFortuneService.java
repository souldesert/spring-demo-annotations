package ru.voskhod.springdemotwo;

public class NapFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "Take a nap for 2 hours";
    }
}
