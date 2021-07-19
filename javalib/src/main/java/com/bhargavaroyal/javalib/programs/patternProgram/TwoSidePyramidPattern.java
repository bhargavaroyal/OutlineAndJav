package com.bhargavaroyal.javalib.programs.patternProgram;
/*•	STEP 1: START
•	STEP 2: SET lines= 10
•	STEP 3: SET space=(lines/2)-2
•	STEP 4: SET i=1 REPEAT STEP 5 to STEP 17 UNTIL i is less than or equals to lines.
•	STEP 5: SET flag1=0
SET l=1
•	STEP 6: REPEAT STEP 7 and 8 UNTIL l is less than or equals to i
•	STEP 7: IF flag1 is not true
PRINT '*' and INCREMENT flag1 by 1
ELSE PRINT BLANK SPACE "" WITH "*"
•	STEP 8: SET l=l+1
•	STEP 9: SET l=1
•	STEP 10: REPEAT STEP 11 UNTIL l is less than or equals to space
•	STEP 11: PRINT "" and SET l=l+1
•	STEP 12: DECREMENT space by 4.
•	STEP 13: SET l=1 and SET flag=1
•	STEP 14: REPEAT STEP 15 UNTIL l is less than or equals to i
•	STEP 15: IF flag is not true PRINT * and increment flag by 1.
ELSE PRINT BLANK SPACE "" WITH * .
•	STEP 16: PRINT new line
•	STEP 17: SET i=i+1
•	STEP 18: INCREMENT space by 4
•	STEP 19: SET i=lines/2
•	STEP 20: REPEAT STEP 21 to STEP 25 UNTIL i is greater than 1
•	STEP 21: SET flag=0 SET l=1
•	STEP 22: REPEAT STEP 23 and 24 UNTIL l is less than or equals to i
•	STEP 23: IF flag is not true PRINT *
ELSE PRINT "" + *
•	STEP 24: SET l=l+1
•	STEP 25: PRINT new line, SET i=i-1
•	STEP 26: EXIT
*/
public class TwoSidePyramidPattern {
    /*public static void main(String []args){
int lines=10;
int space=(lines*2)-2;
for(int i=1;i<=(lines/2);i++)//this loop is used to print one half lines
{
boolean flagl=false;
for(int l=1;l<=i;l++)//this loop is used to print the * in a line
{
if(!flagl){
System.out.print("*");
flagl=true;
}
else
{
System.out.print("");
System.out.print("*");
}
}
for(int l=1;l<=space;l++)//this loop is used to print the space in a line
{
System.out.print("");
}
space=space-4;// Decrement space by 4
boolean flagr=false;
for(int l=1;l<=i;l++)
{
if(!flagr){
System.out.print("*");
flagr=true;
}
else
{
System.out.print("");
System.out.print("*");
}

}
System.out.println("\n");
}
space=space+4;
for(int i=(lines/2);i>=1;i--)// this loop is used to print the one half lines
{
boolean flagl=false;
for(int l=1;l<=i;l++)// this loop is used to print * in a line
{
if(!flagl){
System.out.print("*");
flagl=true;
}
else
{
System.out.print("");
System.out.print("*");
}
}

for(int l=1;l<=space;l++)// this loop is used to print the space in a line
{
System.out.print("");
}
space=space+4;//Increment space by 4
boolean flagr=false;
for(int l=1;l<=i;l++)// this loop is used to print * in a line
{
if(!flagr){
System.out.print("*");
flagr=true;
}
else
{
System.out.print("");
System.out.print("*");
}
}
System.out.println("\n");
}
}
*/

}
