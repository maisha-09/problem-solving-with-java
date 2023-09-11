import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = obj.nextInt();

        System.out.println("Enter the value of b: ");
        int b = obj.nextInt();

        if(a<50&&a<b)
        {
            System.out.println("Both conditions are true");
        }
        else
        {
            System.out.println("At least one condition is false");
        }
    }
}