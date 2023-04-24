package org.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Paper {
    private String subject;

    public Paper() {
        super();
        System.out.println("paper:constructor");
    }

    public String getSubject() {
        System.out.println("paper:getter");
        return subject;
    }

    public void setSubject(String subject) {
        System.out.println("paper:setter");
        this.subject = subject;
    }

    @PostConstruct
    public void init()
    {
        System.out.println("paper:init called");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("paper:destroy called");
    }

    @Override
    public String toString() {
        return "Paper{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
