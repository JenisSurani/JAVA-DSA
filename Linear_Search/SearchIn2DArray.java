package Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] n1 = {
                      {11, 22, 33}
                ,     {44, 55}
                ,     {66, 77, 88, 1111}
                ,     {1, 0, 3}
        };

        // we can also write like this
        /*
        *
         int[][] n11 = new int[][]{{11,22,33},{44,55},{66,77,88,99},{1,2,3}};
        * but this is not required because we are telling in lhs that we need 2d array of int*/
        int target = 3;

        System.out.println(Arrays.toString(searchIn2D(n1, target)));
        System.out.println(maxIn2D(n1));
        System.out.println(minIn2D(n1));
    }

    static int[] searchIn2D(int[][] n1, int target) {

        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n1[i].length; j++) {
                if (n1[i][j] == target)
                    return new int[]{i, j};
                // if we do this
                // return {i,j} how will java know that this is an integer array
                // means java will says where is the declaration of this array
            }

            // we can not create enhanced for loop here because we need to return the index


        }
        return new int[]{-1, -1};
    }

    static int maxIn2D(int[][] n1)
    {
        int max = Integer.MIN_VALUE;
        for(int[] nk : n1)
        {
            for (int element :nk)
            {
                if (element>max)
                {
                   max=element;
                }
            }
        }
        return max;
    }
    static int minIn2D(int[][] n1)
    {
        int min = Integer.MAX_VALUE;
        for(int[] nk : n1)
        {
            for (int element :nk)
            {
                if (element<min)
                {
                    min=element;
                }
            }
        }
        return min;
    }
}
