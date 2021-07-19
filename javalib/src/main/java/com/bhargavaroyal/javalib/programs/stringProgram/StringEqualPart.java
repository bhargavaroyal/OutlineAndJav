package com.bhargavaroyal.javalib.programs.stringProgram;

/*To check whether the string can be divided into N equal parts, we need to divide the length of the
string by n and assign the result to variable chars.
If the char comes out to be a floating point value, we can't divide the string otherwise run a for
loop to traverse the string and divide the string at every chars interval.
The algorithm of the program is given below.
Algorithm
1.	Define a string and define n, i.e., no. of equal parts that string needs to be divided in.
2.	No. of characters (variable chars) in each substring will be found out by dividing the length of the string by n.
3.	If the string cannot be divided into n equal parts, then display an error message.
4.	Else divide the string from i to chars (no. Of character)
5.	Then increment the count by chars and continue dividing the string till you get all the parts of the string.
6.	Print the count.
*/
public class StringEqualPart {
    /*    public static void main(String[] args) {
          String str = "aaaabbbbcccc";

        //Stores the length of the string
        int len = str.length();
        //n determines the variable that divide the string in 'n' equal parts
        int n = 3;
        int temp = 0, chars = len/n;
        //Stores the array of string
        String[] equalStr = new String [n];
        //Check whether a string can be divided into n equal parts
        if(len % n != 0) {
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");
        }
        else {
            for(int i = 0; i < len; i = i+chars) {
                //Dividing string in n equal part using substring()
                String part = str.substring(i, i+chars);
                equalStr[temp] = part;
                temp++;
            }
    System.out.println(n + " equal parts of given string are ");
            for(int i = 0; i < equalStr.length; i++) {
                System.out.println(equalStr[i]);
                }
            }
        }
*/
}
