package SearchIn_2D;

import java.util.Arrays;

public class SearchInSorted2D {
    public static void main(String[] args) {
        int[][] n1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(searchInSorted2dArray(n1, 14)));
        // with time complexity: o(logn) + o(logm) // n=rows,m=cols;
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        // perform binary search in specified row
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] searchInSorted2dArray(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious,matrix may be empty
        if (rows == 0 || cols == 0)
        {
            return new int[]{-1, -1};
        }
        // edge case:
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }
        // if you have nxn array then,

        int cMid = cols / 2;
        int rStart = 0;
        int rEnd = rows - 1;
        while (rStart < rEnd - 1) {
            // keep running this while loop till you find the least 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }

        }
        // after the while loop now we have 2 rows matrix

        // now we have to check for that our target is in between cMid column or not
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};

        }

        // now search in 4 parts:

        if (cMid - 1 >= 0 && matrix[rStart][cMid - 1] >= target) {
            // that means our target is in 1st part
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        else if (cMid + 1 < cols && matrix[rStart][cMid + 1] <= target && matrix[rStart][cols - 1] >= target) {
            // matrix[rStart][cMid + 1] > target that means our target can be in 2nd part and 4th part
//     matrix[rStart][cMid + 1] < target && matrix[cMid + 1][cols-1] > target   that means your target is in 2nd part
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);
        }
        else if (cMid - 1 >= 0 && matrix[rStart+1][cMid - 1] >= target) {
            // 1st part is already checked in 1st condition
            // that means our target is in 3rd part
            return binarySearch(matrix, rStart+1, 0, cMid - 1, target);
        }
        else {
            // that means our target is in 4th part
            return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
        }
        // 4th case will return -1 -1 if target not exist in array


    }
}
