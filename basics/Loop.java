package basics;

public class Loop {
    public static void main(String[] args) {

        String[] names = {"John", "Jane", "Jack", "Jill", "Joe"};
        // System.out.println(names[0]);
        // System.out.println(names[1]);
        // System.out.println(names[2]);
        // System.out.println(names[3]);
        // System.out.println(names[4]);

        // for each loop
        for (String name : names) {
            System.out.println(name);
        }

        // or by for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for(int j = 1;j<=10;j++) {
            if(j == 7) break;
            System.out.println("message" + j);
        }

        int k = 11;
        do {
            System.out.println("message" + k);
            k++;
        } while (k <= 10);

        int i = 1;
        while (i <= 10) {
            System.out.println("message" + i);
            i++; // i + 1
        }

    }

}



