package BS_Question;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
class Solution4 {
    public int peakIndexInMountainArray(int[] arr) {

        int start = 0, end = arr.length - 1;
        int mid=-1;

        while (start < end) {
            // if we do not have target means arr ne increasing/decreasing sorted hovu jaruri nathi
            // we need to break loop when there is only one element is left
            // means end and start is pointing to the same element
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // that means you are in descreasing part
                // so our ans is left hand side
                // but mid can also be our answer if it is max number

                // so we search in lhs
                end = mid;
            }

            if (arr[mid] < arr[mid + 1]) {
                // means you are in increasing part
                // so your answer in rhs
                // condition itself saying that mid+1 is greater than mid so mid ans nahi ho skta

                start = mid + 1;
            }
        }

        // this 2 checks are trying to get max element at each iteration
        // when both equals means we get our max element
        return end; // or return start;
    }


}

public class PeakInMountain {
    public static void main(String[] args) {
        Solution4 ss = new Solution4();
        int[] arr = {5, 6, 8, 9,10, 7, 6, 5, 3};
        System.out.println(ss.peakIndexInMountainArray(arr));
    }
}