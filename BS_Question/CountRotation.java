package BS_Question;

//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
class Solution10
{
    // if i found the peakindex is that pivot and return the index of it
    // means i am returning the total rotation of the array
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
        return -1;

}

public int TotalRotationOfArr(int[] arr)
{

    return findPeakElement(arr)+1;
}
}
public class CountRotation {
    public static void main(String[] args) {

        Solution10 nn = new Solution10();
        int[] arr = {7,11, 22, 66, 4, 5, 6};
        System.out.println(nn.TotalRotationOfArr(arr));
    }
}
