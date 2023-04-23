package org.springcore.ci;

public class Certificate {
    private String name;

    public Certificate()
    {
        super();
    }
    public Certificate(String name) {
        super();
        this.name = name;
        System.out.println("Certificate Constructor Called");
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "name='" + name + '\'' +
                '}';
    }
}
