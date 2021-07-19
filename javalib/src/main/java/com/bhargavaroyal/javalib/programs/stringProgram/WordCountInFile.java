package com.bhargavaroyal.javalib.programs.stringProgram;
/*1.	Open a file in read mode using file pointer.
2.	Read a line from file.
3.	Split the line into words and store it in an array.
4.	Iterate through the array, increment count by 1 for each word.
5.	Repeat all these steps till all the lines from the files has been read.
*/
public class WordCountInFile {
    /*    public static void main(String[] args) throws Exception {
        String line;
        int count = 0;

        //Opens a file in read mode
        FileReader file = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(file);

        //Gets each line till end of file is reached
        while((line = br.readLine()) != null) {
            //Splits each line into words
            String words[] = line.split(" ");
            //Counts each word
            count = count + words.length;
        }

        System.out.println("Number of words present in given file: " + count);
        br.close();
    }
*/
}
