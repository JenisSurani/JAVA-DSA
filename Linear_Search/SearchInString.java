package Linear_Search;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String n1="Jenis surani";
        char target='x';

        System.out.println(searchInString(n1,target));
        System.out.println(Arrays.toString(n1.toCharArray()));
    }

     static boolean searchInString(String n1, char target) {
         if (n1.isEmpty())
         {
             return false;
         }
         // we convert the string into char array for foreach loop usage
        for (char i: n1.toCharArray())
        {
            if (i==target)
            {
                return true;
            }
        }
         return false;
    }
}
