package BS_Question;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {


        // we have sorted ascending char array so let me try BS first
        int start = 0, mid = 0, end = letters.length - 1;

        // edge case if target is the greater than the largest number(last index) of the array
        // in that case no ceiling is exist

        if (target > letters[end] || target == letters[end]) {
            return letters[0];
        }

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // when loop is violated start will hold the just greater char than the target
        // end will hold the just smallest char than the target
        return letters[start];

    }

    public char nextGreatestLetter2(char[] letters, char target) {


        // we have sorted ascending char array so let me try BS first
        int start = 0, mid = 0, end = letters.length - 1;


        while (start <= end) {
            mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // when loop is violated start will hold the just greater char than the target
        // end will hold the just smallest char than the target

        // letters.lenght will make start 0 if start is try to return index out of bound otherwise only start index will be returned via % operator.
        return letters[start % letters.length];

    }
}

public class CeilingOfChar {
    public static void main(String[] args) {
        char[] n1 = {'a', 'b', 'c'};
        Solution obj = new Solution();
        System.out.println(obj.nextGreatestLetter(n1, 'd'));
    }
}

// leetcode problem: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
