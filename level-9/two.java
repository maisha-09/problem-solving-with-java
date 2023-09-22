import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = obj.nextLine();

        System.out.println("You entered: " + userInput);

        obj.close();
    }
}
