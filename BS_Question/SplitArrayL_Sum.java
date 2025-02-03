package BS_Question;
//https://leetcode.com/problems/split-array-largest-sum/description/
class Solution11 {
    public int splitArray(int[] nums, int k) {
        int start = 0, end = 0, mid = 0;

        // first of all we find the range of our ans
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        // so our range is ready and our answer is in [start,end]
        // so apply binary search on this range

        while (start < end) {
            // after each iteration reinitialized those two
            int parts = 1, currentSum = 0;
            mid = start + (end - start) / 2;
            // now mid will hold the sum for partion array that this if will follow

            for (int num : nums) {
                if (currentSum + num > mid) {
                    currentSum = num;
                    parts++;
                } else {
                    currentSum += num;
                }
            }

            // so now we have spliteed arrays

            // now check for our parts
            if (parts>k)
            {
                // mid can be our ans but our ans should at left side
                // because we want smaller bigger ans

                start=mid+1;
            }
            else {
                // means your sum is too small make it some large
                end=mid;
            }

        }
        // after the break of loop mid=start=end will hold the sum of array that is min

        return end;
    }
}

public class SplitArrayL_Sum {
    public static void main(String[] args) {
        Solution11 nn = new Solution11();
        int[] n1 = {11,55,33,22,9};
        System.out.println(nn.splitArray(n1,2));
    }
}

/*
Author: Jenis Surani
Date: 30/01/2025
Topic: Split Array Largest Sum
 */

