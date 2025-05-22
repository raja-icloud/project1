package basics;
public class Conditional {
    public static void main(String[] arguments) {
        String name = arguments[0];
        String age = arguments[1];
        int ageInt = Integer.parseInt(age); // Convert String to int

        if(ageInt < 18) {
            System.out.println("You are a minor");
        } else if(ageInt >= 18 && ageInt < 60) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior citizen");
        }
        
        if(name.equals("RAJA")) {
            System.out.println("Given name is RAJA");
        } else if(name.equals("RAJESH")) {
            System.out.println("Given name is RAJESH");
        } else {
            System.out.println("Given name is not RAJA or RAJESH");
        } 
    
    }
}

// Task tamil, english, matsh, science, social
// write a method to calculate total value
// write a method to calculate average value
// write a method to calculate percentage value
// write a method to calculate Pass or Faild
