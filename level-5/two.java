import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int num1 = obj.nextInt();

        System.out.println("Enter the 2nd number: ");
        int num2 = obj.nextInt();
        if (num1 > num2) {
            System.out.println("the greatest number is: " + num1);
        } else {
            System.out.println("the greatest number is: " + num2);
        }

        obj.close();
    }
}
