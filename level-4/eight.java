import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int num1 = obj.nextInt();

        System.out.println("Enter the 2nd number: ");
        int num2 = obj.nextInt();

        System.out.println("Enter the 3rd number: ");
        int num3 = obj.nextInt();

        if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("All Numbers are equal");
        } else if ((num1 == num2) || (num1 == num3) || (num3 == num2)) {
            System.out.println("Only two number is equal");
        } else {
            System.out.println("All Numbers are Different");
        }

        obj.close();
    }
}
