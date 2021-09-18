Code Example:
import java.io.*;
class StringLength
{
    public static void main (String[] args)
    {
        StringBuffer s=new StringBuffer("SampleText");
        int p=s.length();
        int q=s.capacity();
        System.out.println("Length of string SampleText="+p);
        System.out.println("Capacity of string SampleText="+q);
    }
}