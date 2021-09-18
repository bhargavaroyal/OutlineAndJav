/ A Java program to demonstrate that we should be careful
// when replacing conditional operator with if else or vice
// versa
import java.io.*;
class Conditional
{
    public static void main (String[] args)
    {
        // Expression 1 (using ?: )
        // Automatic promotion in conditional expression
        Object o1 = true ? new Integer(4) : new Float(2.0);
        System.out.println(o1);
 
        // Expression 2 (Using if-else)
        // No promotion in if else statement
        Object o2;
        if (true)
            o2 = new Integer(4);
        else
            o2 = new Float(2.0);
        System.out.println(o2);
    }
}