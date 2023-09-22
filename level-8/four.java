import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        int[] originalArray = new int[10];
        int[] reversedArray = new int[10];

        Scanner obj = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            originalArray[i] = obj.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i];
        }

        System.out.println("Original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nReversed array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        obj.close();
    }
}
