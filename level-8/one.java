import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        int[] integerArray = new int[10];

        Scanner obj = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            integerArray[i] = obj.nextInt();
        }
        System.out.println("The integers you entered are:");
        for (int num : integerArray) {
            System.out.println(num);
        }
        obj.close();
    }
}
