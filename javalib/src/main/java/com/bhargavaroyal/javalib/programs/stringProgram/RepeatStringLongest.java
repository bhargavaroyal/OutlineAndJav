package com.bhargavaroyal.javalib.programs.stringProgram;

/*1.	Define a string and calculate its length.
2.	Define a function for the longest common prefix that is, it takes two strings as arguments and
determines the longest group of characters common in between them.
3.	Using the same function, we will compare original string will all its substrings.
Then, first for loop compare all the substrings with all the other substrings till we find the longest repeating sequence.
4.	Storing the longest string in the variable lrs if the length of x is greater than lrs.
*/
public class RepeatStringLongest {
    /*    //Checks for the largest common prefix
    public static String lcp(String s, String t){
        int n = Math.min(s.length(),t.length());
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }

    public static void main(String[] args) {
        String str = "acbdfghybdf";
        String lrs="";
        int n = str.length();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                //Checks for the largest common factors in every substring
                String x = lcp(str.substring(i,n),str.substring(j,n));
                //If the current prefix is greater than previous one
                //then it takes the current one as longest repeating sequence
                if(x.length() > lrs.length()) lrs=x;
            }
        }
        System.out.println("Longest repeating sequence: "+lrs);
    }
*/

}
