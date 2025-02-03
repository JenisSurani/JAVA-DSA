package Conditional_in_java;

import java.util.Scanner;

public class Counting_Occurrences {
    public static void main(String[] args) {
/*
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
//        long number = sc.nextLong();
        String num = sc.next();
        char[] num1 = new  char[100];

//        while (num.charAt())
        for (int i = 0; i < num.length(); i++) {
            num1[i] = num.charAt(i);
        }

        System.out.println("Enter the number that you want to count occureences");
        char countThis = sc.next().charAt(0);
        int count=0;

        for (int i = 0; i < num1.length; i++) {
            if (num1[i]==countThis)
            {
                count++;
            }
        }
        System.out.println("The total count is: "+count); */
        // this may be cause error in some case just extereme level dimag used and doing this hahaha..



        // Approch-2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        long num = sc.nextLong();
        System.out.println("Enter the number that you want to count occurrences");
        int countThis=sc.nextInt();
        int count=0;

        while (num>0)
        {
            if (num%10==countThis)
            {
                count++;
            }
            num=num/10;
        }
        System.out.println("Total occurrences is: "+count);
    }
}
