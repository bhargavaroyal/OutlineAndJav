// Java program to illustrate to match
// of start and end of a substring
import java.io.*;
 
class GFG
{
  public static void main (String[] args)
  {
    // This is a string in which substring
    // is to be searched.
    String str = "GeeksforGeeks is a computer science portal";
 
    System.out.println(str.startsWith("Geek"));
    System.out.println(str.startsWith("is", 14));
    System.out.println(str.endsWith("port"));
  }
}