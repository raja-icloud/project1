
// class is a prototyope of an object
// class is a blueprint  objects

public class Home {
    

    public static void main(String[] args) {
       System.out.println(args[0]);
       System.out.println(args[1]);
       calculate();
    }

    public static void calculate() {
        int a = 5;
        int b = 10;
        int sum = add(a, b);
        System.out.println("Sum: " + sum);
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

}



