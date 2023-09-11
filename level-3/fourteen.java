import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int originalNumber = scanner.nextInt();

        scanner.close();

        if (originalNumber >= 1000 && originalNumber <= 9999) {
            int thousands = originalNumber / 1000;
            int hundreds = (originalNumber % 1000) / 100;
            int tens = (originalNumber % 100) / 10;
            int ones = originalNumber % 10;

            thousands += 2;
            hundreds += 2;
            tens += 2;
            ones += 2;

            int newNumber = thousands * 1000 + hundreds * 100 + tens * 10 + ones;

            System.out.println("The number with digits increased by 2: " + newNumber);
        } else {
            System.out.println("Please enter a valid 4-digit number.");
        }
    }
}