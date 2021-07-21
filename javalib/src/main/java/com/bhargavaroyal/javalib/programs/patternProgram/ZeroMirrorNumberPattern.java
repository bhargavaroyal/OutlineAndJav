package com.bhargavaroyal.javalib.programs.patternProgram;
/*0
909
89098
7890987
678909876
56789098765
4567890987654
345678909876543
23456789098765432
1234567890987654321
Algorithm
•	STEP 1: START
•	STEP 2: SET lines=10
SET i=1
•	STEP 3: REPEAT STEP 4 to 15 UNTIL i is less than or equals to lines
•	STEP 4: SET count =0
SET j=1
•	STEP 5: REPEAT STEP 6 and 7 UNTIL j is less than lines
•	STEP 6: IF count is less than (i-1)
IF j is not less than (lines-i+1)
PRINT j AND INCREMENT count by 1
•	STEP 7: SET j=j+1
•	STEP 8: PRINT 0
•	STEP 9: SET count =0
•	STEP 10: DECREMENT j by 1
•	Step 11: REPEAT STEP 12 and 13 UNTIL j is greater than 0
•	STEP 12: IF count is less than (i-1)
PRINT j AND INCREMENT count by 1
•	STEP 13: SET j = j - 1
•	STEP 14: PRINT new line
•	STEP 15: i = i + 1
•	STEP 16: EXIT
*/
public class ZeroMirrorNumberPattern {

    /*     public static void main(String []args){
         int lines=10;
   int i,j;
   int count;
   for(i=1;i<=lines;i++){// this loop is used to print lines
       count=0;
        for(j=1;j<lines;j++){// this loop is used to print numbers in a line
            if(count<i-1){
                if(!(j<lines-i+1)){
                    System.out.print(j);
                    count++;
                }
            }
        }
        System.out.print("0");
        count=0;
        for(--j;j>=1;j--){// this loop is used to print j and increment count
            if(count<i-1){
            System.out.print(j);
            count++;
            }
        }
        System.out.println("");
   }
     }
*/
}
