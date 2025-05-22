package basics;
public class StringConcept2 {
    public static void main(String[] args) {
        StringBuilder msg2 = new StringBuilder("World"); // its not thread safe
        // StringBuffer msg2 = new StringBuffer("World"); // its thread safe


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                msg2.append("A");
                System.out.println("Thread 1: " );
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                msg2.append("B");
                System.out.println("Thread 2: " );
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(msg2.length());

    }
}
