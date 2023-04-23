package org.springcore.ci;

public class Person {
    private int personId;
    private String personName;
    private  Certificate certificate;

    public Person()
    {
        super();
    }
    public Person(int personId, String personName, Certificate certificate) {
        super();
        this.personId = personId;
        this.personName = personName;
        this.certificate = certificate;
        System.out.println("Person Constructor Called");
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", certificate=" + certificate +
                '}';
    }
}