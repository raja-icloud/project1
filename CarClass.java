class HomdaVehilcle {
    public static String brand = "Honda";
    public String type; 
    public int fuielCapacity; 
    private String color;

    public HomdaVehilcle() {
        System.out.println("Constructor method called");
    }

    public void print() {
        System.out.println("{ brand: "+this.brand+", type: "+this.type+", fuelCapacity:"+this.fuielCapacity+", color:"+this.color+" }");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}


public class CarClass {
    
    public static void main(String[] args) {
        int a = 10;
        System.out.println(HomdaVehilcle.brand);

        HomdaVehilcle hondaCity1 = new HomdaVehilcle();
        // the way to access the public property
        hondaCity1.type = "CAR";
        hondaCity1.fuielCapacity = 35;
        System.out.println(hondaCity1.type);
        // way to acess the private property
        hondaCity1.setColor("Red");
        System.out.println(hondaCity1.getColor());

        hondaCity1.print();
    }
}
