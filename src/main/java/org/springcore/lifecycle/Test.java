package org.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        context.registerShutdownHook();
        Samosa s1 = (Samosa) context.getBean("samosa");
        System.out.println(s1);
        Pepsi p1 = (Pepsi) context.getBean("pepsi");
        System.out.println(p1);
        Paper pap1 = (Paper) context.getBean("paper");
        System.out.println(pap1);
    }
}
