package com.bhargavaroyal.javalib.programs.stringProgram;

/*1.	Define a string.
2.	To counts the words present in the string, we will iterate through the string and count the spaces present in the string. As each word always ends with a space.
3.	If a string starts with a space, then we must not count the first space as it is not preceded by a word.
4.	To count the last word, we will increment the count by 1.
*/
public class CountWordString {
/*
*     public static void main(String[] args) {
        String sentence = "Beauty lies in the eyes of beholder";
        int wordCount = 0;

        for(int i = 0; i < sentence.length()-1; i++) {
            //Counts all the spaces present in the string
            //It doesn't include the first space as it won't be considered as a word
            if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {
                wordCount++;
            }
        }
        //To count the last word present in the string, increment wordCount by 1
        wordCount++;

        //Displays the total number of words present in the given string
        System.out.println("Total number of words in the given string: " + wordCount);
    }
*/
}
