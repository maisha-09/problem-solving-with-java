import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = obj.nextInt();

        if (isEligibleToVote(age)) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        obj.close();
    }

    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

}
