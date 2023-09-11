import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scnf = new Scanner(System.in);
        int h = scnf.nextInt();
        int w = scnf.nextInt();
        if (h == w) {
            System.out.println("The rectangle is squere");
        } else {
            System.out.println("The rectangle is not squere");

        }
        scnf.close();
    }
}
