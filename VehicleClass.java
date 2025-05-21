class Vehicle {
    String brand; // Instance level variable or class level variable 
    static String brandOfTire; // instance level variable but common memory for all the instances
    private int price; // we can access this private proper out side of class, so we need public member to manupulate this private property
    // Getter method for private property
    public int getPrice() {
        return price;
    }
    // setter method for private property
    public void setPrice(int price) {
        this.price = price;
    }
    // No arge constructor
    public Vehicle() {
        System.out.println(Vehicle.brandOfTire);
        System.out.println(this.brand);
        System.out.println("Vehicle constructor called");
    }
    // parameterized construcor
    Vehicle(String brandName) {
        System.out.println("Given Brand Name = " + brandName);
    }
    // parameterized construcor
    Vehicle(String bandName, int fuelCapacity) {
        int a = 10; // Local variables
        System.out.println(bandName);
        System.out.println(fuelCapacity);
    }
    
}



public class VehicleClass {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Honda", 35);
        // v1.price = 4000; // we can access private property like this, so we need to call getter & setter
        v1.setPrice(400000);
        System.out.println(v1.getPrice());

        v1.brand = "New Brand"; // we can access public property like this
        System.out.println(v1.brand);

        Vehicle v2 = new Vehicle("SKODA", 25);
    }
}
