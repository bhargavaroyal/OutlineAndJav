package com.bhargavaroyal.javalib.programs.patternProgram;
/*1.	Start
2.	Let i be an integer number.
3.	Let j be an integer number.
4.	Let row be an integer number and initialize by 6.
5.	Let coe be an integer number and initialize by 0.
6.	Repeat step 7 to 14 until all value parsed.
7.	Set i = 0 and check I <= row;
8.	Set j = 1 and check j <= row-i;
9.	Print space.
10.	check if j==0 || i==0
11.	set coe = 1;
12.	Else
13.	Set coe = coe * (i+j-1)/j;
14.	Print coe.
15.	End
*/
public class InvertedVNumberFormat {
    /*    public static void main(String[] args)
    {
        int coe=1,rows = 6;
     for(int i = 0; i < rows; i++) {
            for(int space = 1; space < rows - i; ++space) {
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    coe = 1;
                else
                    coe = coe * (i - j + 1) / j;

                System.out.printf("%4d", coe);
            }
      System.out.println();
        }
    }
*/
}
