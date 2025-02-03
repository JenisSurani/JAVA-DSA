package Linear_Search;

class FindEvenDigits {

    // Solution-1: Using the string method
    public int evenDigits(int[] nums) {
        int count = 0;
        for (int element : nums) {
            if (isEven(element)) {
                count++;
            }
        }

        return count;
    }

    // int + string = string + string = string
    // now number is converteed into the string and now can use the string.length method
    public boolean isEven(int element) {
        String temp = element + "";
        return temp.length() % 2 == 0;
    }


    // Solution 2 using while loop
    public int evenDigits2(int[] nums) {
        int count = 0;
        for (int element : nums) {
            if (isEven2(element)) {
                count++;
            }
        }

        return count;
    }

    // Can also use & operator to check number is even or odd
    public boolean isEven2(int element) {
        return countTheDigits(element) % 2 == 0;
    }

    // if num is negative while loop will not excecute so make sure to make the number positive
    public int countTheDigits(int element) {
        if (element < 0) {
            element *= -1;
        }
        if (element == 0) {
            return 1;
        }
        int count = 0;
        while (element > 0) {
            count++;
            element /= 10;
        }
        return count;
    }

    // Another way to count the digits in the number

    public int countTheDigits2(int element) {
        if (element < 0) {
            element *= -1;
        }
        if (element == 0) {
            return 1;
        }
        return (int) Math.log10(element) + 1;
    }


}


public class EvenDigits {
    public static void main(String[] args) {
        int[] n1 = {11, 2, 33, 44, 5,999,99,22,33};

        // this will print how many no of n1 contains even no of digits
        FindEvenDigits n2 = new FindEvenDigits();
//        System.out.println(n2.countTheDigits2(0));

        System.out.println(n2.evenDigits2(n1));
        System.out.println();

    }
}



