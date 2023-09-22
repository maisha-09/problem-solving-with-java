
public class five {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int sum = 0;
        int product = 1;

        for (int num : arr) {
            sum += num;
            product *= num;
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}
