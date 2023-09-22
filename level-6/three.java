
public class three {
    public static void main(String[] args) {
        int[] numbers = { 24, 50, 29 };

        for (int number : numbers) {
            System.out.println("Multiplication table of " + number + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

            System.out.println();
        }
    }
}
