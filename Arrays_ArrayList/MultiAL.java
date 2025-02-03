package Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> n2 = new ArrayList<>();
// now it is like [(ref here pointing to )null,(ref here pointing to) null,(..)null,(..)null.....]

        // [ _ _ _ _ _ ...] ArrayList of ArrayList
        //   | | | | |
        //   | | | | |
        //   | | | | |
//           v v v v v ...
//    Arraylist Arraylist Arraylist Arraylist

        // so first of all we need to add some arraylist in the arraylist

        n2.add(new ArrayList<>());
        n2.add(new ArrayList<>());
        n2.add(new ArrayList<>()); // we add 3 arraylist in main arraylist

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n2.get(i).add(sc.nextInt());
            }
        }

        // now we are printing the arraylist of arraylist
        System.out.println(n2);

    }
}
