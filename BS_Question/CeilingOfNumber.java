package BS_Question;


public class CeilingOfNumber {
    public static void main(String[] args) {
        //    0 1 2 3  4  5  6  7  8  9  10  11  12  13    14
int[] arr = {11,22,33,44,55,66,77,88,99,100,110,120,130,130,140,150};
        System.out.println(ceilingOfNumber(arr,111));

    }
    static int ceilingOfNumber(int[] arr,int target)
    {
        // we have sorted array so let me try BS first
        int start=0,mid=0,end=arr.length -1;

        // edge case if target is the greater than the largest number(last index) of the array
        // in that case no ceiling is exist

        if (target>arr[end])
        {
            return -1;
        }

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
            } else  {
                return arr[mid];
            }
        }
        // when loop is violated start will hold the just greater number than the target
       // end will hold the just smallest number than the target
        return arr[start];
    }


}
