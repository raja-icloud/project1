package basics;
// @@@@@@ UpperCamelCase (for class names)
// UserName 
// LastName
// ImFromChennai

// @@@@@@ lowerCamelCase (for method names)
// userName
// lastName
// imFromChennai

// @@@@@@ UPPER_SNAKE_CASE (for constants)
// @@@@@@ lower_snake_case (for variables)


public class Variable {

    public static void main(String[] args) {

        // constants
        final int MAX_VALUE = 100;
        // MAX_VALUE = 200; // This will cause a compilation error because MAX_VALUE is declared as final

        String name; // variable declaration
        name = "John Doe"; // variable initialization
        name = "Rocky"; // variable reassignment or update or muitation
        System.out.println(name); // variable usage

        int balance = 100;
        System.out.println(balance);

        int[] balances = {   100,   200,  300,   400,   500 };
        System.out.println(balances[0]);
        String[] user_names = { "John", "Jane", "Doe", };
        char[] chars = { 'a', 'b', 'c' };
       
        // Date types
        // primitve types
        // int, long, float, double, char, boolean, byte
        int year = 2023;
        long month = 10l;
        float day = 5.2434f; 
        double hour = 10.0000000074234234234234;
        char minute = 'a'; 
        boolean isDay = true;
        byte byteValue = 127;
        short shortValue = 32767;

        // Non premitive types
        String second = "asdfasdf asdfasdf 23423 #";
        Integer integerValue = 100;
        Double doubleValue = 100.00;
        Character characterValue = 'a';
        Boolean booleanValue = true;
       
        // Loosly typed
        // var is a keyword in Java that allows you to declare a variable without specifying its type explicitly.
        var age = 30;
        var isEmployed = true;
        
    }

}



