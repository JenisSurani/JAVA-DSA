package Functions_Methods;

import java.util.Scanner;

public class solution {
    static int maxNum(int num1, int num2, int num3) {
        int maxNumber = Integer.MIN_VALUE;
        if (maxNumber < num1) {
            maxNumber = num1;
        }
        if (maxNumber < num2) {
            maxNumber = num2;
        }
        if (maxNumber < num3) {
            maxNumber = num3;
        }
        return maxNumber;
    }

    static int minNum(int num1, int num2, int num3) {
        int minNum = Integer.MAX_VALUE;
        if (minNum > num1) {
            minNum = num1;
        }
        if (minNum > num2) {
            minNum = num2;
        }
        if (minNum > num3) {
            minNum = num3;
        }
        return minNum;
    }

    static boolean isPrime(int n) {
        if (n==1)
        {
            System.out.println("1 neither prime nor composite");
            return false;
        }
        int startFromHere = 2;
        while (startFromHere * startFromHere <= n) {
            if (n % startFromHere == 0) {
                return false;
            }
            startFromHere++;
        }
        return true;
    }
    //If n has a factor greater than √n, then it must have a corresponding factor smaller than √n,
    // which would have been checked earlier.

    static boolean isPalindrone(int n) {
        int orignal = n;
        int sum = 0, remainder;
        while (n > 0) {
            remainder = n % 10;
            sum = sum*10 + remainder;
            n/=10;
        }
        System.out.println(sum);
        return orignal==sum;
    }

    static int sumOfFirstN(int n)
    {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }

    static int  factorial(int n)
    {
        if (n==1 || n==0)
        {
            return 1;
        }
        int fac=1;
        for (int i = 1; i <=n ; i++) {
           fac *= i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        System.out.println("Please Enter 3 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println(maxNum(num1, num2, num3));
        System.out.println(minNum(num1, num2, num3)); */

        // program for number is palindrome or not?
        System.out.println(isPrime(29));
//        System.out.println(isPalindrone(1234567));

        /*
        // program for finding all the prime numbers between two numbers
        System.out.println("Please enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        for (int i = num1; i <=num2 ; i++) {
            if (isPrime(i))
            {
                System.out.print(i+" ");
            }
        }*/

        // program for sum of first n numbers
//        System.out.println(sumOfFirstN(5));

        // program for factorial
//        System.out.println(factorial(4));
    }
}
