package ru.voskhod.springdemotwo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GolfJavaConfigDemoApp {
    public static void main(String[] args) {
        // use spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MySpringConfig.class);

        // get the beans from spring container
        Coach coach = context.getBean("golfCoach", Coach.class);

        // call a method on the bean
        System.out.println(coach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(coach.getDailyFortune());

        // close the context
        context.close();
    }
}
