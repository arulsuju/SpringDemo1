package com.luv2code.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String args[])throws Exception
    {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Coach c = context.getBean("tcid", Coach.class);
            System.out.print(c.getDailyWorkout());
            context.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
