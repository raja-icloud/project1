import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println("==========Sigle D============");
        String[] names = {"john", "kavin", "Kumar"};
        for (String name : names) {
            System.out.println(name);
        }


        System.out.println("==========Two D============");
        int[][] twoDNumbers = {{1, 2}, {3, 4}}; // 2x2
        for (int item[] : twoDNumbers) {
            for (int element : item) {
                System.out.print(element);
            }
            System.out.println("");
        }
        
        // Array create
        int[] numbers =  {10, 20, 700, 40, 50, 60, 70, 80, 40}; // new int[8];

        // INCREESE THE SIZE OF AN ARRAY
        // numbers = Arrays.copyOf(numbers, 15);

        // Array update
        // numbers[4] = 500;

        // SORT ARRAY
        // Arrays.sort(numbers);

        // CONVERT ARRAY TO STRING
        // System.out.println(Arrays.toString(numbers));

        // // FIND SIZE OF ANY ARRAY
        // System.out.println("Array length: " + numbers.length);

        // FIND MAX VALUE FROM ARRAY
        // int max = findMax(numbers);
        // System.out.println("Max value is :" + max);

        // REMOVE DUPLICATES 
        int[] uniqueNumbers = removeDuplicates(numbers);
        System.out.println(Arrays.toString(uniqueNumbers));
    }

    public static int[] removeDuplicates(int[] array) {
        // REMOVE DUPLICATES
        int[] uniqueNumbers = new int[array.length]; // empay array
        int index = 0; // index push
        for(int item: array) {
            if(isExist(uniqueNumbers, item) == false) { // in empay array, current item is exist or not
                uniqueNumbers[index] = item; // push into array if not exist in the empry array
                index++; // next pushable index
            }
        }
        return uniqueNumbers;

    }

    public static boolean isExist(int[] array, int value) {
        // SEARCH AN ELEMENT
        int expectedValue = -1;
        for(int element: array) {
            if(element == value) {
                expectedValue= element;
            }
        }
        return expectedValue != -1;
    }

    // public static int findMax(int[] array) {
    //     int max = 0;
    //     for(int element: array) {
    //         if(element > max) {
    //             max = element;
    //         }
    //     }
    //     return max;
    // }
}