package com.bhargavaroyal.javalib.programs.stringProgram;
/*Two Strings are called the anagram if they contain the same characters.
However, the order or sequence of the characters can be different. In this program, our task is
to check for two strings that, they are the anagram or not. For this purpose, we are following a
simpler approach. First of all, Compare the length of the strings, if they are not equal in the
length then print the error message and make an exit, otherwise, convert the string into lower-case
 for the easy comparisons. Sort both the strings using bubble sort or other sorting methods.
  If the strings are found to be identical after sorting, then print that strings are anagram otherwise
   print that strings are not the anagram.
Algorithm
1.	Define two strings.
2.	Check for their lengths. If the lengths are not equal, then strings are not an anagram.
3.	Else, convert the string to lower case character to make the comparison easy.
4.	Some language allows the strings to provide inbuilt function for sorting of string. If not then convert them to character array for sorting.
5.	Sort the array.
6.	Finally, check for the equality of content.
*/
public class AnagramString {
    /*public class Anagram {
    public static void main (String [] args) {
        String str1="Brag";
        String str2="Grab";

        //Converting both the string to lower case.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Checking for the length of strings
        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not anagram");
        }
        else {
            //Converting both the arrays to character array
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            //Sorting the arrays using in-built function sort ()
            Arrays.sort(string1);
            Arrays.sort(string2);

            //Comparing both the arrays using in-built function equals ()
            if(Arrays.equals(string1, string2) == true) {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
*/
}
