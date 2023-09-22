import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = obj.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = obj.nextInt();

        int product = calculateProduct(num1, num2);

        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        obj.close();
    }

    public static int calculateProduct(int a, int b) {
        return a * b;
    }
}
