import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = obj.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = obj.nextInt();

        int gcd = calculateGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        obj.close();
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }
}