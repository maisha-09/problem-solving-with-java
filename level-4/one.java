import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int num1 = obj.nextInt();

        System.out.println("Enter the 2nd number: ");
        int num2 = obj.nextInt();
         
        int sum = num1+num2;
        int product=  num1*num2;

        System.out.println("The sum of"+num1+"and"+num2+"is: "+sum);
        System.out.println("The product of"+num1+"and"+num2+"is: "+product);
    }
}
