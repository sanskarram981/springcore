package org.springcore;
import org.springcore.ci.Person;
import org.springcore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springcore.ref.*;
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

        ApplicationContext context2 = new ClassPathXmlApplicationContext("refconfig.xml");
        A a1 = (A)context2.getBean("aref");
        System.out.println(a1);
        A a2 = (A)context2.getBean("aref1");
        System.out.println(a2);
        A a3 = (A)context2.getBean("aref2");
        System.out.println(a3);

        ApplicationContext context3 = new ClassPathXmlApplicationContext("ciconfig.xml");
        Person p1 = (Person)context3.getBean("person");
        System.out.println(p1);
        Person p2 = (Person)context3.getBean("person1");
        System.out.println(p2);

    }
}
