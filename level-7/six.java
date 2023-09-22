import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = obj.nextDouble();

        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);

        obj.close();
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);

    }
}
