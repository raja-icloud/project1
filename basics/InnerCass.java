package basics;
class Student {
    String name;
}


public class InnerCass {

    class Vehicle {
        String brand="Honda";
    }

    static class User {
        String name = "Raja";
    }

    public static void main(String[] args) {
        // Non static inner class
        InnerCass t1 = new InnerCass();
        Vehicle v1 = t1.new Vehicle();
        System.out.println(v1.brand);

        // For static inner class
        User user1 = new User();
        System.out.println(user1.name);

        // For Third party class
        Student s1 = new Student();
        System.out.println(s1.name);
    }
}
