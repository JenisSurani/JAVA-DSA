package Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-19, -17, -2, 0, 5_5, 66, 77, 99, 100};
        int[] arr2 = {100, 99, 90, 80, 76, 55, 33, 22, -11, -19, -100};
        System.out.println(orderAgnosticBS(arr2, -100));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0, mid, end = arr.length - 1;

        // to check whether array is ascending or in descending
        boolean isAsc = arr[start] < arr[end];
        System.out.println(isAsc);
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } // this case is same for the both case

            if (isAsc) {
                // ifAsc is true do this
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else {
                // means our array is in descending order
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        // means target not exist in the array
        return -1;
    }
}
