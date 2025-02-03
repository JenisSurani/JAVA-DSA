//package BS_Question;
//
//
//// https://leetcode.com/problems/find-in-mountain-array/description/
//
//interface MountainArray
//{
////    public int get(int index)
////    {
////        return MountainArray[index];
////    }
////    public int length() {
////        return MountainArray.length
////    } // we are assume this are the methods in this interface
//}
//class Solution6 implements  MountainArray {
//    public int findInMountainArray(int target, MountainArray arr) {
//
//        // first find the peakelement in mountainarray
//        int start = 0, end = arr.length() - 1;
//        int mid = -1;
//
//        while (start < end) {
//
//            mid = start + (end - start) / 2;
//            if (arr.get(mid) > arr.get(mid + 1)) {
//
//                end = mid;
//            }
//
//            if (arr.get(mid) < arr.get(mid + 1)) {
//
//                start = mid + 1;
//            }
//        }
//
//        // now start and end is holding the peak element index
//
//            // please give me sorted array
//            int start1=0,mid1,end1=start;
//
//            while (start1<=end1)
//            {
//                mid1 = start1 + (end1-start1)/2;
//
//                if (arr.get(mid1)> target)
//                {
//                    end1=mid1-1;
//                }
//                else if(arr.get(mid1)<target)
//                {
//                    start1=mid1+1;
//                } else {
//                    return mid1;
//                }
//            }
//
//
//        int start2=start,mid2,end2=arr.length()-1;
//
//        while (start2<=end2)
//        {
//            mid2 = start2 + (end2-start2)/2;
//
//            if (arr.get(mid2) < target)
//            {
//                end2=mid2-1;
//            }
//            else if(arr.get(mid2) > target)
//            {
//                start2=mid2+1;
//            } else {
//                return mid2;
//            }
//        }
//        // means target not exist in the array
//        return -1;
//
//    }
//
//
//}
//
//
//public class FindInMountain {
//    public static void main(String[] args) {
//
//    }
//}
