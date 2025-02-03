package Linear_Search;

public class Linear {
    public static void main(String[] args) {

        int[] arr ={11,22,33,44,55,66,77,88,99};
        int target=33;
        System.out.println(linearSearch(arr,target));
    }

     static int linearSearch(int[] arr, int element) {
        if (arr.length==0)
        {
            return -1;
        }
         for (int index = 0; index < arr.length; index++) {
             if (element==arr[index])
             {
                 return index;
             }
         }
         return -1;
    }
}
