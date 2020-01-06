package ru.voskhod.springdemotwo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // use spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the beans from spring container
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(swimCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(swimCoach.getDailyFortune());

        // call SwimCoach specific methods

        System.out.println("email: " + swimCoach.getEmail());
        System.out.println("team: " + swimCoach.getTeam());

        // close the context
        context.close();
    }
}
