import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the length: ");
        double length = obj.nextDouble();

        System.out.println("Enter the breadth: ");
        double breadth = obj.nextDouble();

        double area = length * breadth;

        int areaInt = (int) area;

        System.out.println("The area of a rectangle is: " + areaInt);

        obj.close();
    }
}
