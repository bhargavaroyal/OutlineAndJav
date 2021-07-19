package com.bhargavaroyal.javalib.programs.stringProgram;
/*In this program, we need to find the most repeated word present in given text file. This can be done by opening a
file in read mode using file pointer. Read the file line by line. Split a line at a time and store in an array.
Iterate through the array and find the frequency of each word and compare the frequency with maxcount.
If frequency is greater than maxcount then store the frequency in maxcount and corresponding word that in variable word.
The content of data.txt file used in the program is shown below.
1.	data.txt

1.	Variable maxCount will store the count of most repeated word.
2.	Open a file in read mode using file pointer.
3.	Read a line from file. Convert each line into lowercase and remove the punctuation marks.
4.	Split the line into words and store it in an array.
5.	Use two loops to iterate through the array. Outer loop will select a word which needs to be count. Inner loop will match the selected word with rest of the array. If match found, increment count by 1.
6.	If count is greater than maxCount then, store value of count in maxCount and corresponding word in variable word.
7.	At the end, maxCount will hold the maximum count and variable word will hold most repeated word.

*/
public class RepeatedWordInFile {
    /*        String line, word = "";
        int count = 0, maxCount = 0;
        ArrayList<String> words = new ArrayList<String>();

        //Opens file in read mode
        FileReader file = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(file);

        //Reads each line
        while((line = br.readLine()) != null) {
            String string[] = line.toLowerCase().split("([,.\\s]+)");
            //Adding all words generated in previous step into words
            for(String s : string){
                words.add(s);
            }
        }

        //Determine the most repeated word in a file
        for(int i = 0; i < words.size(); i++){
            count = 1;
            //Count each word in the file and store it in variable count
            for(int j = i+1; j < words.size(); j++){
                if(words.get(i).equals(words.get(j))){
                    count++;
                }
            }
            //If maxCount is less than count then store value of count in maxCount
            //and corresponding word to variable word
            if(count > maxCount){
                maxCount = count;
                word = words.get(i);
            }
        }

        System.out.println("Most repeated word: " + word);
        br.close();
    }
*/
}
