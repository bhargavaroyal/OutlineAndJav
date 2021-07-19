package com.bhargavaroyal.javalib.programs.stringProgram;
/*1.	Define a string.
2.	Convert the string to lowercase to make it case-insensitive.
3.	Add an extra space at the end.
4.	Now, iterate through the string till space is found and add those character into variable word. Add each word into words array. Array words will hold all the words present in the string.
5.	Initialize variable small and large with first word of array.
6.	Iterate through array words, check if the length of word is less than small. If yes, store that word in small.
7.	If the length of word is greater than large. If yes, store that word in large.
8.	At the end, display the smallest and largest word.
*/
public class LargestSmallestWordString {
/*    public static void main(String[] args){
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        String word = "", small = "", large="";
        String[] words = new String[100];
        int length = 0;

        //Add extra space after string to get the last word in the given string
        string = string + " ";

        for(int i = 0; i < string.length(); i++){
            //Split the string into words
            if(string.charAt(i) != ' '){
                word = word + string.charAt(i);
            }
            else{
                //Add word to array words
                words[length] = word;
                //Increment length
                length++;
                //Make word an empty string
                word = "";
            }
        }

        //Initialize small and large with first word in the string
        small = large = words[0];

        //Determine smallest and largest word in the string
        for(int k = 0; k < length; k++){

            //If length of small is greater than any word present in the string
            //Store value of word into small
            if(small.length() > words[k].length())
                small = words[k];

            //If length of large is less than any word present in the string
            //Store value of word into large
            if(large.length() < words[k].length())
                large = words[k];
        }

        System.out.println("Smallest word: " + small);
        System.out.println("Largest word: " + large);
    }
*/
}
