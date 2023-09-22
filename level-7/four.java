import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = obj.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = obj.nextInt();

        int sum = calculateSum(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        obj.close();
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }
}