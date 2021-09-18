Code Example:
import java.io.*;
class StringAppend
{
    public static void main (String[] args)
    {
        StringBuffer s=new StringBuffer("Sample");
        s.append("Text");
        System.out.println(s); //returns SampleText
        s.append(1);
        System.out.println(s); //returns SampleText1
    }
}