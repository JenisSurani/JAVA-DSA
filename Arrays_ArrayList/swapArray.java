package Arrays_ArrayList;

import java.util.Arrays;

public class swapArray {
    static void swapArr(int[] arr, int startIndex, int endIndex) {
        int i = startIndex, j = endIndex, temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        System.out.println(Arrays.toString(arr));
        swapArr(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

        // print the max item in the array

        System.out.println(getMaxvalue(arr));
        System.out.println(getMinvalue(arr));

    }

    static int getMaxvalue(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }  static int getMinvalue(int[] arr) {
        int max=Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < max) {
                max = j;
            }
        }
        return max;
    }

}

