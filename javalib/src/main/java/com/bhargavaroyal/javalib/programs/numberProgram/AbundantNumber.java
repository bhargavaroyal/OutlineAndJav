package com.bhargavaroyal.javalib.programs.numberProgram;

public class AbundantNumber {
    /*public static void main(String[] args) {
        System.out.println("Enter the number?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Abundant_number  a = new Abundant_number();
        if(a.checkAbundant(n))
        {
            System.out.println("The number is Abundant.");
        }
        else
        {
            System.out.println("The number is not Abundant.");
        }
    }
    public int getSum(int n)
    {
        int sum = 0;
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                if (n/i == i)
                    sum = sum + i;
                else
                {
                    sum = sum + i;
                    sum = sum + (n / i);
                }
            }
        }
        sum = sum - n;
        return sum;
    }
    public  boolean checkAbundant(int n)
    {
        return (getSum(n) > n);
    }*/
}
