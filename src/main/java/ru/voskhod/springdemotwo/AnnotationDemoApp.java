package ru.voskhod.springdemotwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the beans from spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach swimmingCoach = context.getBean("swimmingCoach", Coach.class);

        // call a method on the bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(swimmingCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
