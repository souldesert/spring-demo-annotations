package ru.voskhod.springdemotwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve beans from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if they are the same
        boolean result = (coach == alphaCoach);
        System.out.println("Pointing to the same object: " + result);
        System.out.println("Memory location for coach: " + coach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach);

        // close context
        context.close();
    }
}
