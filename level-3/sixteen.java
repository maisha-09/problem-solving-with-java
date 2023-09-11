import java.util.Scanner;

public class sixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number >= 100 && number <= 999) {
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;

            int reversedNumber = ones * 100 + tens * 10 + hundreds;

            System.out.println("Reversed number: " + reversedNumber);
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }
    }
}
