// Java program to illustrate how to find a substring
// in the string using contains
import java.io.*;
import java.lang.*;
 
class GFG
{
  public static void main (String[] args)
  {
    // This is a string in which substring
    // to be searched.
    String test = "software";
 
    CharSequence seq = "soft";
    boolean bool = test.contains(seq);
    System.out.println("Found soft?: " + bool);
 
    // it returns true substring if found.
    boolean seqFound = test.contains("war");
    System.out.println("Found war? " + seqFound);
 
    // it returns true substring if found otherwise
    // return false.
    boolean sqFound = test.contains("wr");
    System.out.println("Found wr?: " + sqFound);
  }
}