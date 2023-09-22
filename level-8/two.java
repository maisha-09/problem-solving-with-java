import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        int[] integerArray = new int[10];

        Scanner obj = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            integerArray[i] = obj.nextInt();
        }

        System.out.print("Enter a number to search: ");
        int searchNumber = obj.nextInt();

        boolean found = false;
        for (int num : integerArray) {
            if (num == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchNumber + " is present in the array.");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }
        obj.close();
    }
}
