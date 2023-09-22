import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = obj.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        obj.close();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
