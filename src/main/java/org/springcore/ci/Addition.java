package org.springcore.ci;
// Ambiquity problem in constructor injection in spring core.

// In case of implict type declaration,first preference will be given as String  parameter then from top to down.
// In case of explicit type declaration , the suitable will be bonded.

public class Addition {
    private int a;
    private int b;

    public Addition(int a,int b)
    {
        System.out.println("(int a,int b)");
        this.a = a;
        this.b = b;
    }

    public Addition(double a,double b)
    {
        System.out.println("(double a,double b)");
        this.a = (int)a;
        this.b = (int)b;
    }

    public Addition(String a,String b)
    {
        System.out.println("(String a,String b)");
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }

    public Addition(String a,double b)
    {
        System.out.println("(String a,double b)");
        this.a = Integer.parseInt(a);
        this.b = (int)b;
    }

    public void sum()
    {
        System.out.println("The value of the sum is : "+(this.a + this.b));
    }
}
