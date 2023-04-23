package org.springcore;

import org.springcore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student st1 = (Student) context.getBean("student1");
        System.out.println(st1);
        Student st2 = (Student) context.getBean("student2");
        System.out.println(st2);
        Student st3 = (Student) context.getBean("student3");
        System.out.println(st3);
        ApplicationContext context1 = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Emp em1 = (Emp) context1.getBean("employee");
        System.out.println(em1);

    }
}
