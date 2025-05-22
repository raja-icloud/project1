package basics;
// Data type (byte, short, int, long, float, double, char, boolean)
// identifier (variable name, method name, class name, interface name, enum name)
// literal (value) - 1, 2, 3, 4, 5, 6.0, 'A', true
// Array - int[], String[]
// method - create & invoke
// conditaion statement - if, switch
// loop - for, while, do while

public class ReCall {

    public static void main(String[] args) {
        System.out.println(args[0]); // raja
        System.out.println(args[1]); // manickam

        // Data types
        // Primitive data types
        byte b = 1; // 8 bits
        short s = 2; // 16 bits
        int i = 3; // 32 bits
        long l = 4; // 64 bits
        float f = 5.0f; // 32 bits
        double d = 6.0; // 64 bits
        char c = 'A'; // 16 bits
        boolean bool = true; // 1 bit
        // Non-primitive data types
        String str = "Hello, World!"; // String

        int[] arr = {1, 2, 3}; 
        System.out.println(arr[0]); // 1
        System.out.println(arr[1]); // 2
        System.out.println(arr[2]); // 3

        String[] strArr = {"Hello", "World"};
        System.out.println(strArr[0]); // Hello
        System.out.println(strArr[1]); // World

        int val = 5;
        test(val);
    }

    public static void test(int a) {

        switch (a) {
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
            default:
                System.out.println("a is not 1 or 2 or 3");
                break;
        }

        if(a == 1) {
            System.out.println("a is 1");
        } else if(a == 2) {
            System.out.println("a is 2");
        } else if(a == 3) {
            System.out.println("a is 3");
        } else {
            System.out.println("a is not 1 or 2 or 3");
        }
    }
}



