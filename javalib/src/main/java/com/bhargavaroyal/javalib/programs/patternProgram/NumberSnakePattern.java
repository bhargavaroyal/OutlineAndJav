package com.bhargavaroyal.javalib.programs.patternProgram;
/*•	STEP 1: Start
•	STEP 2: SET i=1,j=1,k=1,l=1,direction=1
•	STEP 3: SET matrix[10][10]
•	STEP 4: REPEAT STEP 5 to 9 UNTIL i is less than 10
•	STEP 5: SET j=0
•	STEP 6: REPEAT STEP 7 and 8 UNTIL j is less than 10
•	STEP 7: SET matrix[i][j]=0
•	STEP 8: SET j=j+1
•	STEP 9: SET i=i+1
// steps for printing the matrix
•	STEP 10: SET i=0
•	STEP 11: REPEAT STEP 12 to 16 UNTIL i is less than 10
•	STEP 12: SET j=0
•	STEP 13: REPEAT STEP 14 and 15 UNTIL j is less than 10
•	STEP 14: PRINT matrix[i][j]
•	STEP 15: SET j=j+1
•	STEP 16: SET i=i+1
//steps for snake
•	STEP 17: SET i=1
•	STEP 18: SET j=0
•	STEP 19: SET k=0
•	STEP 20: REPEAT STEP 21 to 26 UNTIL i is less than 100
•	STEP 21: SET matrix[j][k]=i
•	STEP 22: IF direction=1
IF k+1<10
IF matrix[j][k+1]==0
SET k=k+1
ELSE SET j=j+1 and SET direction =2
ELSE SET j= j+1 and SET direction =2
•	STEP 23: IF direction=2
IF j+1<10
IF matrix[j+1][k]==0
SET j=j+1
ELSE SET k=k-1 and SET direction =3
ELSE SET k= -1 and SET direction =3
•	STEP 24: IF direction=3
IF k-1>=0
IF matrix[j][k-1]==0
SET k=k-1
ELSE SET j=j-1 and SET direction =4
ELSE SET j= j-1 and SET direction =4
•	STEP 25: IF direction=4
IF j-1>=0
IF matrix[j-1][k]==0
SET j=j-1
ELSE SET k=k+1 and SET direction =1
ELSE SET k= k+1 and SET direction =1
•	STEP 26: SET i=i+1
// Steps for printing the matrix
•	STEP 27: SET i=0
•	STEP 28: REPEAT STEP 29 to 33 UNTIL i is less than 10
•	STEP 29: SET j=0
•	STEP 30: REPEAT STEP 31 and 32 UNTIL j is less than 10
•	STEP 31: PRINT matrix[i][j]
•	STEP 32: SET j=j+1
•	STEP 33: SET i=i+1
•	STEP 34: Stop
*/
public class NumberSnakePattern {
    /*     public static void main(String []args){
    int matrix[][]=new int[10][10];
    int i,j,k,l;
    int direction=1;
    for(i=0;i<10;i++){   //this loop is used to access one line of matrix
        for(j=0;j<10;j++){   // this loop is used to access one element
           matrix[i][j]=0;
        }
    }
        System.out.print("Matrix before snake=\n");
    for(i=0;i<10;i++){   // this loop is used to print one line of matrix
        for(j=0;j<10;j++){//this loop is used to print one element of matrix
          System.out.print(matrix[i][j]+"\t");
        }
        System.out.println("");
    }
    for(i=1,j=0,k=0;i<=100;i++){// this loop is used to set pattern
        matrix[j][k]=i;

        switch(direction){
            case 1:if(k+1<10){
                        if(matrix[j][k+1]==0){
                            k++;    // if direction=1 and matrix[j][k+1]=0
                            continue;
                        }
                        else{

                            j++;    // if direction=1 and matrix[j][k+1]!=0

                            direction=2;
                            continue;
                        }
                    }

                   else{
                        j++;    // if k+1 is not smaller than 10
                        direction=2;
                        continue;
                    }
            case 2:if(j+1<10){

                        if(matrix[j+1][k]==0){
                            j++;    //if direction=2 and matrix[j+1][k]=0
                            continue;
                        }
                        else{
                            direction=3;
                            k--;    //if direction=2 and matrix[j+1][k]!=0
                            continue;
                        }
                    }
                    else{
                            direction=3;
                            k--;    //j+1 is not smaller than 10
                            continue;
                        }
            case 3:if(k-1>=0){
                        if(matrix[j][k-1]==0){

                            k--;    // if direction=3 and matrix[j][k-1]=0
                            continue;
                        }
                        else{
                            direction=4;
                            j--;    // if direction=3 and matrix[j][k-1]!=0
                            continue;
                        }
                    }
                    else{
                            direction=4;
                            j--;    //k-1 is not greater than -1
                            continue;
                        }

            case 4:if(j-1>=0){
                        if(matrix[j-1][k]==0){

                            j--;    //if direction=4 and matrix[j-1][k]=0
                            continue;
                        }
                        else{
                            k++;    //if direction=4 and matrix[j-1][k]!=0
                            direction=1;
                            continue;
                        }
                    }
                    else{
                            k++;    //if j-1 is not greater than -1
                            direction=1;
                            continue;
                        }
        }
    }
        System.out.println("Matrix after snake=\n");
     for(i=0;i<10;i++){  //this loop is used to print one line of matrix
        for(j=0;j<10;j++){       //this loop is used to print one element
          System.out.print(matrix[i][j]+"\t");
        }
        System.out.println("");
    }
     }
*/
}
