class Student {
    public String name; // instance level variable
    public int age;
    public String address;
    private int wallet;
    public static String school; // instnce level commen variable

    // Constructor
    public Student(String newName, int newAge) {
        // int a = 10;  // local variable
        this.name = newName;
        this.age = newAge;
    }

    // setter method
    public void setWallet(int newAmount) {
        this.wallet = newAmount;
    }
    // getter method
    public int getWallet() {
        return this.wallet;
    }

}


public class ClassConcept {
    public static void main(String[] args) {
        // create user object by User prototype (User Class)
        Student.school = "Govt School";

        Student userOne = new Student("RAJA", 30);
        // update public property of userOne object
        userOne.address = "Trichy";
        userOne.school = "private school";
        userOne.setWallet(1000);
        // React public proper of userOne obect
        System.out.println(userOne.name);
        System.out.println(userOne.age);
        System.out.println(userOne.address);
        System.out.println(userOne.getWallet());
        
    }
}


// static is used to create common resource for all the object of same class