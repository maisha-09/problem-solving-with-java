import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int number = obj.nextInt();

        if (number >= 10000 && number <= 99999) {
            int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
            int secondLastDigit = Integer.parseInt(Integer.toString(number).substring(3, 4));

            int sum = firstDigit + secondLastDigit;

            System.out.println("The sum of the first and second last digits of " + number + " is: " + sum);
        } else {
            System.out.println("Please enter a valid 5-digit number.");
        }

        obj.close();
    }
}
