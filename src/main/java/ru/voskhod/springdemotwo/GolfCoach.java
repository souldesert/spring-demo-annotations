package ru.voskhod.springdemotwo;

public class GolfCoach implements Coach {

    private FortuneService fortuneService;

    public GolfCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit as hard as you can";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
