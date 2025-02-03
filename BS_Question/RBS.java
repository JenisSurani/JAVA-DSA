package BS_Question;

//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
class Solution7 {
    public int search(int[] nums, int target) {
        int pivotIndex = findPeakElement(nums);
        // once you find the pivot element that is max element index in nums
        if (pivotIndex == -1) {
            return binarySearch(nums,target,0, nums.length-1);
        }

        // means pivot is found
        if (target==nums[pivotIndex])
        {
            return pivotIndex;
        }
        if (target >= nums[0]) {
            // means your target is in 1st part of the array
            return binarySearch(nums, target, 0, pivotIndex-1);
        } else {
            // else your target is in 2nd part of the array
            return binarySearch(nums, target, pivotIndex + 1, nums.length - 1);
        }


    }

    public int findPeakElement(int[] arr) {
        // Mountain array will not work if the array is not following the mountain array rules
        // ex if [5,1,2];

        int start = 0, mid, end = arr.length - 1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            // case 1:
            if (mid < end && arr[mid] > arr[mid + 1]) {
                // if mid<end then only mid+1 is valid
                // here if mid is last element of the array it might throw the error
                return mid;
            }
            // case 2:
            if (mid > start && arr[mid] < arr[mid - 1]) {
                // if mid> start then only mid-1 is valid
                return mid - 1;
            }
            // case 3:
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            if (arr[start] < arr[mid]) {
                start = mid + 1;
            }

            // if our array is in only increasing order means our fun will never be found the pivot of 2 element from where array start decrasing
            // means case -1 and case -2 will never execute


        }
        // means no pivot exist in this array
        return -1;

    }
    public int binarySearch(int[] arr, int target, int start, int end) {
        // please give me sorted array
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        // means target not exist in the array
        return -1;
    }
}

public class RBS {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
    }

}

