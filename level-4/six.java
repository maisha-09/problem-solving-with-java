import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = obj.nextInt();

        int square = number * number;

        System.out.println("The square of the number: " + square);

        obj.close();
    }
}
