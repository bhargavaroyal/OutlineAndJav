package com.bhargavaroyal.javalib.programs.stringProgram;
/*1.	Define a string.
2.	Define an array freq with the same size of the string.
3.	Two loops will be used to count the frequency of each character. Outer loop will be used to select a character and initialize element at corresponding index in array freq with 1.
4.	Inner loop will compare the selected character with rest of the characters present in the string.
5.	If a match found, increment element in freq by 1 and set the duplicates of selected character by '0' to mark them as visited.
6.	Finally, display the character and their corresponding frequencies by iterating through the array freq.
*/
public class FrequencyCharacter {
/*     public static void main(String[] args) {
        String str = "picture perfect";
        int[] freq = new int[str.length()];
        int i, j;

        //Converts given string into character array
        char string[] = str.toCharArray();

        for(i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
        }

        //Displays the each character and their corresponding frequency
        System.out.println("Characters and their corresponding frequencies");
        for(i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }
*/
}
