package org.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
    //@Autowired
    private Address address;

    public Emp()
    {
        super();
        System.out.println("emp:default constructor is called....");
    }

    //@Autowired
    public Emp(Address address) {
        super();
        this.address = address;
        System.out.println("emp:parameterized constructor is called....");
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
        System.out.println("setter is called....");
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
