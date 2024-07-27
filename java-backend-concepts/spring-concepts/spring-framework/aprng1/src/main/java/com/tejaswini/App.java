package com.tejaswini;

import com.tejaswini.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
     public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj = context.getBean(Alien.class);
        obj.code();



//        **************************************************************************
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop dt = context.getBean(Desktop.class);
//        Desktop dt = context.getBean("comp1", Desktop.class);
//        Desktop dt = context.getBean("desktop1", Desktop.class);
//        dt.compile();

//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();

//        Alien obj = context.getBean(Alien.class);
//        obj.code();







//        ***************************************
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // in this step object gets created in IOC container
//        Alien obj = (Alien) context.getBean("alien");
//        Alien obj = context.getBean("alien", Alien.class);
//        Alien obj = context.getBean(Alien.class);
//        obj.code();
//        System.out.println(obj.getAge());
    }
}
