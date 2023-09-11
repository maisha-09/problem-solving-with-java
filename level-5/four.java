import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the amount of salary");
        int salary = obj.nextInt();

        System.out.println("Enter the service: ");
        int yearOfService = obj.nextInt();

        if (yearOfService > 5) {
            double bonusAmount = 0.5 * salary;
            System.out.println("Will get the bonus");
        } else {
            System.out.println("will not");
        }

        obj.close();
    }
}
