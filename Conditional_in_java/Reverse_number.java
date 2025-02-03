package Conditional_in_java;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        // 1234

        // this counts thi length of number
        int totalNumber = 0, temp=num;
        while (temp > 0) {

            temp = temp / 10;
            totalNumber++;
        }
//        System.out.println(totalNumber);

        int remainder=0, tempnum = 0;
        while (num>0) {
            remainder = num % 10;
            tempnum += (int) (remainder * Math.pow(10,(totalNumber-1)));
            totalNumber--;
            num /= 10;
        }
        System.out.println(tempnum);
*/

        // Solution-2

        // each time we get the remainder we * 10 and then add remainder to it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        long num = sc.nextLong();
        int ans=0,remainder;
        while (num>0)
        {
            remainder= (int)num%10;
            ans = ans*10 + remainder;
            num /= 10;
        }
        System.out.println(ans);
    }
}
