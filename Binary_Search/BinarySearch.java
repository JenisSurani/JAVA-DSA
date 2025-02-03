package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
int[] arr = {-19,-17,-2,0,5_5,66,77,99,100};

        System.out.println(binarySearch(arr,1));
    }

    public static int binarySearch(int[] arr,int target)
    {
        // please give me sorted array
        int start=0,mid,end=arr.length -1;

        while (start<=end)
        {
            mid = start + (end-start)/2;

            if (arr[mid]> target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            } else {
                return mid;
            }
        }
        // means target not exist in the array
        return -1;
    }
}
