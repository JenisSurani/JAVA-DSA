package BS_Question;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution1 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        ans[0] = BinarySearch(nums, target, true);
        if (ans[0]!=-1)
        {
            // if ans[0]=-1 means no target in arr so why we search for end index
        ans[1] = BinarySearch(nums, target, false);
        }

        // logn + logn = 2logn = O(logn);
        return ans;
    }

    public int BinarySearch(int[] arr, int target, boolean findStartIndex) {
        int start = 0, mid, end = arr.length - 1, ans = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid; // update potential ans to mid bcz that could be our ans
                if (findStartIndex) {
                    // find left to the pot ans
                    end = mid - 1;
                } else {
                    // find right to the pot ans
                    start = mid + 1;
                }
//                return mid;
                // we are keep finding the element till loop is running
            }
        }
        // when loop is break means start > end and no such element found but our first/last ouccurence is noted by ans
        return ans;
    }
}

public class First_LastPosition {
    public static void main(String[] args) {
int[] a1 = {11,22,33,33,33,33,33,44,55};
// 2 to 6
        Solution1 nn = new Solution1();
        System.out.println(Arrays.toString(nn.searchRange(a1,33)));
    }
}
