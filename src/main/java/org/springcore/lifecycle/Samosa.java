package org.springcore.lifecycle;

public class Samosa {
    private double price;

    public Samosa()
    {
        super();
        System.out.println("samosa:Constructor is called...");
    }

    public void setPrice(double price) {
        System.out.println("samosa:setter is called....");
        this.price = price;
    }

    public double getPrice() {
        System.out.println("samosa:getter is called......");
        return price;
    }

    public void init()
    {
        System.out.println("samosa:init method is called.....");
    }

    public void destroy()
    {
        System.out.println("samosa:destroy method is called....");
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
}
