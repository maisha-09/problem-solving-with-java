import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the 1st age: ");
        int age1 = obj.nextInt();

        System.out.println("Enter the 2nd age: ");
        int age2 = obj.nextInt();

        System.out.println("Enter the 3rd age: ");
        int age3 = obj.nextInt();

        int oldest = Math.max(Math.max(age1, age2), age3);
        int youngest = Math.min(Math.min(age1, age2), age3);

        System.out.println("The oldest person is " + oldest + " years old.");
        System.out.println("The youngest person is " + youngest + " years old.");

        obj.close();

    }
}
