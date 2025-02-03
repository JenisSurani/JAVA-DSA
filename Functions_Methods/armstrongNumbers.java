package Functions_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class armstrongNumbers {
    static boolean isArmstrong(int n) {
        int a2 = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n/10;
        }
        return a2 == sum;
    }

    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}


