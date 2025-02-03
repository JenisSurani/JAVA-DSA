package SearchIn_2D;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] a1 = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };


        System.out.println(Arrays.toString(searchIn2dArray(a1,38)));
        // note: there is no rule that your matrix should be n x n --> o(n) it can be n x m also in that case time com: o(n+m)
    }

     static int[] searchIn2dArray(int[][] arr, int target) {
        int row=0; // starting from 1st row that is 0
         int column = arr.length-1;

         while (row<arr.length && column>=0)
         {
             if (arr[row][column]==target)
             {
                 return new int[] {row,column};
             }
             else if (arr[row][column]<target) {
                 row++;
             }
             else {
                 column--;
             }
         }
         return new int[]{-1,-1};
    }
}
