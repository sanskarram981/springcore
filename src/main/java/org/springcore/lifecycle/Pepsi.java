package org.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean
{
    private double price;

    public Pepsi()
    {
        super();
        System.out.println("pepsi:constructor is called...");
    }

    public double getPrice() {
        System.out.println("pepsi:getter is called....");
        return price;
    }

    public void setPrice(double price) {
        System.out.println("pepsi:setter is called....");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("pepsi:destroy is called.....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("pepsi:init is called.....");
    }
}
