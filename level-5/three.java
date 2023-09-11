import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int costPerUnit = 100;
        int discountSold = 1000;

        System.out.println("Enter the quantity: ");
        int quantity = obj.nextInt();

        int totalCost = quantity * costPerUnit;

        if (totalCost > discountSold) {
            double discount = 0.10 * totalCost;
            totalCost -= discount;
        }
        System.out.println("Total cost: " + totalCost);

        obj.close();
    }
}
