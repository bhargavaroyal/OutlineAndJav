package com.bhargavaroyal.javalib.programs.stringProgram;
/*
* A string is said to be palindrome if it reads the same backward as forward.
* For e.g. above string is a palindrome because if we try to read it from backward, it is same as forward.
* One of the approach to check this is iterate through the string till middle of string and compare a character from back and forth.
Algorithm
1.	Define a string.
2.	Define a variable flag and set it to true.
3.	Convert the string to lowercase to make the comparison case-insensitive.
4.	Now, iterate through the string forward and backward, compare one character at a time till middle of the string is reached.
5.	If any of the character doesn't match, set the flag to false and break the loop.
6.	At the end of the loop, if flag is true, it signifies string is a palindrome.
7.	If flag is false, then string is not a palindrome.
*/
public class PalindromeString {
/*
*     public static void main(String[] args) {
        String string = "Kayak";
        boolean flag = true;

        //Converts the given string into lowercase
        string = string.toLowerCase();

        //Iterate the string forward and backward, compare one character at a time
        //till middle of the string is reached
        for(int i = 0; i < string.length()/2; i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
*/

}
