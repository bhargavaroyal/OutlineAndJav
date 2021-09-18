import java.io.*;
public class Consructor
{
    // Initializer block starts..
    {
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
    // Initializer block ends
 
    public Consructor()
    {
        System.out.println("Default Constructor invoked");
    }
    public Consructor(int x)
    {
        System.out.println("Parametrized constructor invoked");
    }
    public static void main(String arr[])
    {
        Consructor obj1, obj2;
        obj1 = new Consructor();
        obj2 = new Consructor(0);
    }
}