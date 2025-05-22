package basics;
import java.util.Scanner;

public class ScannerConcept {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(args));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Your Tamil Mars:");
        int tamilMark = scanner.nextInt();

        System.out.println("Enter Your English Mars:");
        int englishMark = scanner.nextInt();

        System.out.println("Enter Your Maths Mars:");
        int mathsMark = scanner.nextInt();

        System.out.println("Enter Your Science Mars:");
        int scienceMark = scanner.nextInt();

        System.out.println("Enter Your Social Mars:");
        int socialMark = scanner.nextInt();
        
        System.out.println("==============================================");
        System.out.println("Hello " + name + ", Your Details are below");
        System.out.println("Total Marks: " + (tamilMark + englishMark + mathsMark + scienceMark + socialMark));
        System.out.println("Average Marks: " + ((tamilMark + englishMark + mathsMark + scienceMark + socialMark) / 5));
        System.out.println("Percentage: " + ((tamilMark + englishMark + mathsMark + scienceMark + socialMark) / 5) * 100 / 100);

    }
}
