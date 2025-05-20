public class StringConcept {
    public static void main(String[] args) {
        String name = "chennai";

        // To get the length of a string
        int length = name.length();
        print(length);
        // To get specific character from a stiring
        char firstChar = name.charAt(0);
        print(firstChar);
        // change string to upperCase
        String upperName = name.toUpperCase();
        print(upperName);
        // chage string to lowerCase
        String lowerName = name.toLowerCase();
        print(lowerName);
        // to take a substring from a string
        String slicedString = name.substring(1, name.length()); 
        print(slicedString);

        String updatedName = Character.toUpperCase(firstChar) + slicedString;
        print(updatedName);

        String firstName = "John";
        String lastName = "Doe";
        // Concatenating two strings  
        String fullName = firstName.concat(lastName); // or String fullName = firstName + lastName;
        print(fullName); 
        
        // replace a string 
        String description = "This is RAJA from Trichy, My native is Trichy";
        String updatedDesc = description.replace("Trichy", "Chennai");
        print(updatedDesc);
    }

    public static void print(String a) {
        System.out.println(a);
    }

    public static void print(char b) {
        System.out.println(b);
    }

    public static void print(int c) {
        System.out.println(c);
    }

}
