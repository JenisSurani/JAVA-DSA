package Arrays_ArrayList;

import java.util.Arrays;

public class temp {
    public static void main(String[] args) {
        int[][] n1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n1[i].length; j++) {
                System.out.print(n1[i][j]+" ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(n1));

        // using arrays.tostring
        for (int i = 0; i < n1.length; i++) {
            System.out.println(Arrays.toString(n1[i]));
        }
        System.out.println();

        // using for each loop
        for (int[] arr : n1)
        {
            System.out.println(Arrays.toString(arr));
        }
    }
}
