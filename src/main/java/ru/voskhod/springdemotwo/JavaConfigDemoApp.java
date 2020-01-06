package ru.voskhod.springdemotwo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // use spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the beans from spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(tennisCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(tennisCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
