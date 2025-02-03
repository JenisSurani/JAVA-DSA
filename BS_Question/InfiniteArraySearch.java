package BS_Question;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
import java.util.Arrays;

class Solution2 {
    public int searchInInfinite(int[] nums, int target) {

        int start = 0, end = 1;

        // One problem: If loop is at mid-1 and running for the next iteration it will throw arrayindexoutofbound exception
        // try last element as target
        // end is acutcally updated at last index before excpetion so we just need to handle the exception
        // here we need to use getvalue function to avoid any errors.
        while (target > getValue(nums, end)) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        // end is always
        return BinarySearch(nums, target, start, end);
    }

    private int getValue(int[] nums, int index) {
        try {
            return nums[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return Integer.MAX_VALUE; // Simulate "infinity" for out-of-bounds indices
        }
    }

    public int BinarySearch(int[] arr, int target, int start, int end) {
        int mid;
        // here end may recive wrong (outofbound value) that is 13 for target 30
        // but end ensure that target is always before end means only start will change means there is no case where mid ka value end jesa hoye or error aaye because end target ke position se +1 hai (in worstcase: if element is last elemnt of the array)
        // so we can use arr[mid] value instead of getvalue() function but using this it is safe for us.
        while (start <= end) {
            mid = start + (end - start) / 2;
            int midValue = getValue(arr, mid);
            if (midValue > target) {
                end = mid - 1;
            } else if (midValue < target) {
                start = mid + 1;
            } else {

                return mid;

            }
        }
        return -1;
    }
}

public class InfiniteArraySearch {
    public static void main(String[] args) {

        Solution2 s1 = new Solution2();
        int[] aa = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 23, 23, 30,33,256};
        System.out.println(aa.length);
        System.out.println(s1.searchInInfinite(aa, 256));
    }
}
