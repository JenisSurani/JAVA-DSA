package BS_Question;

class Solution8 {
    public int search(int[] nums, int target) {
        int pivotIndex = findPeakElement(nums);
        // once you find the pivot element that is max element index in nums
        if (pivotIndex == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // means pivot is found
        if (target == nums[pivotIndex]) {
            return pivotIndex;
        }
        if (target >= nums[0]) {
            // means your target is in 1st part of the array
            return binarySearch(nums, target, 0, pivotIndex - 1);
        } else {
            // else your target is in 2nd part of the array
            return binarySearch(nums, target, pivotIndex + 1, nums.length - 1);
        }


    }

    public int findPeakElement(int[] arr) {
        // if our array contains duplicates case -3  and case -4 will be failed

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
            // start , mid and end are the same
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                // so skip the 1 index from both the side
                // but before to do it check whether start or end is not pivot naa

                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // left side is sorted means your pivot is in right side and if start and mid are the same and end < mid means that confirms that you need to chek right hand side

            // simply ask that where we search in rhs
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }


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

public class RBS_WithDuplicates {
    public static void main(String[] args) {
        Solution8 nn = new Solution8();

        int[] a1 = {11, 22, 33, 44, 55};
        System.out.println(nn.search(a1,22));
    }
}
