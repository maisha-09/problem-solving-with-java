import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = obj.nextLine();

        System.out.println("Enter your roll number: ");
        String rollNumber = obj.nextLine();

        System.out.println("Enter your field of interest: ");
        String fieldofInterest = obj.nextLine();

        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber
                + ".My field of interest are " + fieldofInterest + ".");

        obj.close();

    }
}
