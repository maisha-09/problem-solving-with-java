import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            int number = obj.nextInt();
            total += number;
        }

        double average = (double) total / 10;
        System.out.println("The average of the entered integers is: " + average);

        obj.close();
    }
}