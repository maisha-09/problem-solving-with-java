import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char userInput = obj.next().charAt(0);

        if (Character.isLowerCase(userInput)) {
            System.out.println("The character '" + userInput + "' is lowercase.");
        } else if (Character.isUpperCase(userInput)) {
            System.out.println("The character '" + userInput + "' is uppercase.");
        } else {
            System.out.println("The character '" + userInput + "' is not a letter.");
        }
        obj.close();
    }
}
 