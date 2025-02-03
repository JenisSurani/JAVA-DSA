package Conditional_in_java;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {

        System.out.println("This program prints the nth index of fibonaaci");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int count = 2;
        int a = 0, b = 1, temp;
        while (count <= index) {
            temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.printf("The %dth index of fibonaaci is %d\n",index,b);

    }
}
