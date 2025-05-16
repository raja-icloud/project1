
// className, methodName, varibleName (identifiers)
// 1. it should not start with numbers
// 2. it should not container special chars (except _ & $)
// 3. it should not be reserved keywordk (for, while, class, pulic, static, int, long, etc)
// 4. it should not contain space 

// camelcase (developer recomandation)
// class --> UpperCamelCase
// method ---> lowerCamelCase
// variable --> full and full small, if we need we can use underscore
// constant variable --> full and full upper, if we need, we can use underscore


// premitive data type (int, float, double, char, boolean, bye, long, short)
// non premitive type (Sring, Integer, Fload, Double, Char, Boolean, etch)

// Literal (value is the literal, [1, 10.5, 'char', "hello", 01, true])

// Types of operator
// 1. Arithmaetic ( +, -, *, /, %)
// 2. Assignmeth operator ( +=, -=, = )
// 3. comparition Operator ( <, >, <=, >=, == )
// 4. Logical Operator ( &&, ||, !)

import java.util.Scanner;

public class ReCall2 {
    public static void main(String[] arr) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for Tamil");
        int tamil = scanner.nextInt();
        System.out.println("Enter value for English");
        int english = scanner.nextInt();
        System.out.println("Enter value for Maths");
        int maths = scanner.nextInt();
        System.out.println("Enter value for Science");
        int science = scanner.nextInt();
        System.out.println("Enter value for Social");
        int social = scanner.nextInt();

        System.out.println("Total : " + (tamil + english + maths + science + social));

        // int[] numbers = {15, 11, 14, 13, 12};

        // String a = Integer.toString(numbers[3]); // number to String
        // int numberVaue = Integer.parseInt(a); // string to number

        // System.out.println(a);

        // int sum = 0;
        // for (int arrayElement : numbers) {
        //     if(arrayElement == 13) {
        //         break;
        //     }
        //     sum = sum + arrayElement;
        // }
        // System.out.println(sum);

        // int sum = 0;
        // for (int arrayElement : numbers) {
        //     if(arrayElement == 13) {
        //         continue;
        //     }
        //     sum = sum + arrayElement;
        // }
        // System.out.println(sum);

        // int i = 0;
        // while(i<5) {
        //     if(numbers[i] == 11) {
        //         System.out.println("leven");
        //     } else if(numbers[i] == 12) {
        //         System.out.println("Twel");
        //     } else if(numbers[i]==13) {
        //         System.out.println("Thrteen");
        //     } else if(numbers[i]==14) {
        //         System.out.println("Fourteen");
        //     } else if(numbers[i]==15) {
        //         System.out.println("Fifteen");
        //     } else {
        //         System.out.println("Unknown number");
        //     }
        //     i = i+1;
        // }

        // for (int element : numbers) {
        //     System.out.println(element);
        // }
        
        // int i = 0;
        // while(i<5) {
        //     System.out.println(numbers[i]);
        //     i = i+1;
        // }

        // for(int i = 0; i<5; i=i+1) {
        //     System.out.println(numbers[i]);
        // }


        // System.out.println(name(18));

    }

    // public static String name(int age) {
    //     return age >  17 ?"Magor" : "Minur";   
    // }
}
