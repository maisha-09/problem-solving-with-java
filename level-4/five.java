import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        
        System.out.println("Enter a side of square: ");
        double side = obj.nextDouble();

        double area = side * side;
        double perimeter = 4*side;

        System.out.println("The area of the square is: "+area);
        System.out.println("The perimeter of the square is: "+perimeter);
 }
}
