import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = obj.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = obj.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = obj.nextInt();

        int max = findMax(num1, num2, num3);
        int min = findMin(num1, num2, num3);

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);

        obj.close();
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int findMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
