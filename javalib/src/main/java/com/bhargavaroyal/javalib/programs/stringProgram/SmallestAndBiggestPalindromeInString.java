package com.bhargavaroyal.javalib.programs.stringProgram;

/*1.	Define a string.
2.	Convert the string into lowercase to make it case-insensitive.
3.	Add an extra space at the end.
4.	Now, iterate through the string till space is found and add those characters into variable word.
Add each word into words array. Array words will hold all the words present in the string.
5.	isPalindrome() will iterate the string forward and backward and compare a character at a time.
If there is no match, then set the flag to false. If flag is true, then string is a palindrome.
If flag is false, then string is not a palindrome.
6.	Iterate through array words, and check whether a word is palindrome by calling isPalindrome().
If a word is palindrome, then increment the count by 1. Variable count is used to check whether
there are palindromic words present in the string or not.
7.	When first palindrome is found then, set smallPalin and bigPalin with first palindrome.
8.	When next palindrome is found, check if the length of that palindrome is less than smallPalin.
If yes, store that word in smallPalin.
9.	If length of next palindrome is greater than bigPalin. If yes, store that word in bigPalin.
10.	At the end, if count is equal to 0, then there is no palindrome. Else, display the smallest and biggest palindrome.
*/
public class SmallestAndBiggestPalindromeInString {
    /*    //isPalindrome() checks whether a string is palindrome or not
    public static boolean isPalindrome(String a){
        boolean flag = true;
        //Iterate the string forward and backward and compare one character at a time
        //till middle of the string is reached
        for(int i = 0; i < a.length()/2; i++){
            if(a.charAt(i) != a.charAt(a.length()-i-1)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args){
        String string = "Wow you own kayak";
        String word = "", smallPalin = "", bigPalin="";
        String[] words = new String[100];
        int temp = 0, count = 0;

        //Converts the given string into lowercase
        string = string.toLowerCase();

        //Add extra space after string to get the last word in the given string
        string = string + " ";

        for(int i = 0; i < string.length(); i++){
            //Split the string into words
            if(string.charAt(i) != ' '){
                word = word + string.charAt(i);
            }
            else{
                //Add word to array words
                words[temp] = word;
                //Increment temp
                temp++;
                //Make word an empty string
                word = "";
            }
        }

        //Determine the smallest and biggest palindromes in a given string
        for(int i = 0; i< temp; i++){
            if(isPalindrome(words[i])){

                count++;
                //When first palindromic word is found
                if(count == 1)
                    //Initialize smallPalin and bigPalin with first palindromic word
                    smallPalin = bigPalin = words[i];

                //Compare smallPalin and bigPalin with each palindromic words
                else{
                    //If length of smallPalin is greater than next palindromic word
                    //Store that word in smallPalin
                    if(smallPalin.length() > words[i].length())
                        smallPalin = words[i];

                    //If length of bigPalin is less than next palindromic word
                    //Store that word in bigPalin
                    if(bigPalin.length() < words[i].length())
                        bigPalin = words[i];
                }
            }
        }

        if(count == 0)
            System.out.println("No palindrome is present in the given string");
        else{
            System.out.println("Smallest palindromic word: " + smallPalin);
            System.out.println("Biggest palindromic word: " + bigPalin);
        }
    }
*/
}
