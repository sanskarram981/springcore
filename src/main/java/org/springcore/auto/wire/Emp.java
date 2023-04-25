package org.springcore.auto.wire;

public class Emp {
    private Address address;

    public Emp()
    {
        super();
        System.out.println("emp:default constructor is called....");
    }

    public Emp(Address address) {
        super();
        this.address = address;
        System.out.println("emp:parameterized constructor is called....");
    }

    public void setAddress(Address address) {
        this.address = address;
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
