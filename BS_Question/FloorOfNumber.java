package BS_Question;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99,100,110,120,130,130,140,150};
        System.out.println(floorOfNumber(arr,-15));

    }
    static int floorOfNumber(int[] arr,int target)
    {
        int start=0,mid=0,end=arr.length -1;

        // in that case if target is the less than lowest number in the array it will provide -1 auto
        // because at last iteration start and end is at 0th index and end will move ahead of start that is -1
        // if we retrun the index
        if (target<arr[start])
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
        return arr[end];

    }
}
