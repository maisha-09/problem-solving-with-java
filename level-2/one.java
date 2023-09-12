import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the int: ");

        int num = obj.nextInt();
        System.out.println("Number: " + num);

        Scanner username = new Scanner(System.in);
        System.out.println("User name: ");

        String name = username.nextLine();
        System.out.println("Username: " + name);

        Scanner abc = new Scanner(System.in);
        System.out.println("char: ");

        String cha = abc.nextLine();
        System.out.println("character: " + cha);

        obj.close();
        abc.close();
        username.close();
    }
}
