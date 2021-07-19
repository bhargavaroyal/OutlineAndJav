package com.bhargavaroyal.javalib.programs.numberProgram;
/*Input:
num = 82
Output:
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
82 is a happy number number
*/
public class HappyNumber {
    /*//isHappyNumber() will determine whether a number is happy or not
    public static int isHappyNumber(int num){
        int rem = 0, sum = 0;
        //Calculates the sum of squares of digits
        while(num > 0){
            rem = num%10;
            sum = sum + (rem*rem);
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 82;
        int result = num;

        while(result != 1 && result != 4){
            result = isHappyNumber(result);
        }
        //Happy number always ends with 1
        if(result == 1)
            System.out.println(num + " is a happy number");
            //Unhappy number ends in a cycle of repeating numbers which contains 4
        else if(result == 4)
            System.out.println(num + " is not a happy number");
    }*/
}