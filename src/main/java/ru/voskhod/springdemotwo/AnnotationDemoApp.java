package ru.voskhod.springdemotwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the beans from spring container
//        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        SwimmingCoach swimmingCoach = context.getBean("swimmingCoach", SwimmingCoach.class);

        // call a method on the bean
//        System.out.println(tennisCoach.getDailyWorkout());

        // call method to get the daily fortune
//        System.out.println(tennisCoach.getDailyFortune());
        System.out.println(swimmingCoach.getDailyFortune());
//        System.out.println(swimmingCoach.getTeam());

        // close the context
        context.close();
    }
}
