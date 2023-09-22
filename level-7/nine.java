import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = obj.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = Factorial(n);
            System.out.println(n + "! = " + factorial);
        }

        obj.close();
    }

    public static long Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
