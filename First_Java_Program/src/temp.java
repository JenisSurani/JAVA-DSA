public class temp {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(Byte.MAX_VALUE);
//        int a = 999;
//        byte ab = (byte)a;
//        System.out.println(ab);


        byte a = 10;
        byte b = 100;
        byte c = 110;
//
        int abc = a*b/c;// a* b is byte * byte is means resluting type of a * b is byte but how can a*b that is byte can store 1000
//         java automatically promoted a and b type to int;
        System.out.println(abc);
//
        byte dd = 100;
        dd = (byte)(dd * 2); // byte * int is int but how can we store int to dd because dd is byte
        System.out.println(dd);
//
//        System.out.println(Short.MAX_VALUE);
//        byte a1 =2;
//        short a2 = 32765;
//        short a3 = a2+a1;
//        short a3 =  (short)(a1+a2); // byte + short -> short + short -> int -> needs typecasting
//        System.out.println(a3);
//        int count=1;
//        while(count !=5)
//        {
//            System.out.println(count);
//            count++;
//        }
//        int i = 1_00_000;
//        System.out.println(i); // will ignore the _ because we used _ as an ,
//
//        System.out.println(args[0]+args[1]+args[2]);
        // use terminal and compile this file and give argunments in java temp ________;
    }
}

//When casting an int to a byte, only the lowest 8 bits are retained, and the rest are discarded.

//A byte uses two's complement representation to handle both positive and negative numbers.
//
//In two's complement:
//
//If the most significant bit (MSB, the leftmost bit) is 0, the number is positive.
//If the MSB is 1, the number is negative.


// You can also debugging the program just hold the cursor on the line and click red dot and then right click satrt debugaing
// and give next and see consloe....

