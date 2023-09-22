import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = obj.nextLine();

        String[] names = fullName.split(" ");
        StringBuilder abbreviatedName = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
            if (i < names.length - 1) {
                abbreviatedName.append(names[i].charAt(0)).append(".");
            } else {
                abbreviatedName.append(names[i]);
            }
        }

        System.out.println("Abbreviated Name: " + abbreviatedName);
        obj.close();
    }
}
