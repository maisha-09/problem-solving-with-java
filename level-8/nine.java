
public class nine {
    public static void main(String[] args) {
        int[] initialArray = { 58, 24, 13, 15, 63, 9, 8, 81, 1, 78 };
        int[] firstHalf = new int[5];
        int[] secondHalf = new int[5];

        for (int i = 0; i < 5; i++) {
            firstHalf[i] = initialArray[i];
            secondHalf[i] = initialArray[i + 5];
        }

        System.out.println("Initial array:");
        printArray(initialArray);

        System.out.println("\nAfter splitting:");
        printArray(firstHalf);
        printArray(secondHalf);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
