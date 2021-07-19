package com.bhargavaroyal.javalib.programs.stringProgram;
/*To complete this program, We need to run two for loops. The outer loop is used to maintain the
relative position of the first character and the second loop is used to create all possible subsets
 and prints them one by one.
The algorithm of the program is given below.
Algorithm
1.	Define a string.
2.	All the possible subsets for a string will be n*(n + 1)/2.
3.	Define a string array with the length of n(n+1)/2. This string array will hold all the subsets of the string.
4.	The first loop will keep the first character of the subset.
5.	The second loop will build the subset by adding one character in each iteration till the end of the string is reached.
Eg. String "ABC"
The first loop will hold the position of A, then B then C
The second loop will subset the string into
For i=1: A, AB then ABC for the last iteration
For i=2: B and BC
For i=3: C
6.	Add the subset formed in each iteration into a string array.
7.	The last loop traverses through all the subset formed and print all the subsets.
*/
public class SubsetString {
    /*public static void main(String[] args) {

        String str = "ABC";
        int len = str.length();
        int temp = 0;
        //Total possible subsets for string of size n is n*(n+1)/2
        String arr[] = new String[len*(len+1)/2];

        //This loop maintains the starting character
        for(int i = 0; i < len; i++) {
            //This loop adds the next character every iteration for the subset to form and add it to the array
            for(int j = i; j < len; j++) {
                arr[temp] = str.substring(i, j+1);
                temp++;
            }
        }

        //This loop prints all the subsets formed from the string.
        System.out.println("All subsets for given string are: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
*/
}
