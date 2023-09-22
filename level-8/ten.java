import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = obj.nextInt();

        int[] arr = new int[n];

        // Get the elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        // Find pair with maximum difference
        int maxDiff = Integer.MIN_VALUE;
        int maxDiffFirst = -1, maxDiffSecond = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff > maxDiff) {
                    maxDiff = diff;
                    maxDiffFirst = arr[i];
                    maxDiffSecond = arr[j];
                }
            }
        }

        // Find pair with minimum difference
        int minDiff = Integer.MAX_VALUE;
        int minDiffFirst = -1, minDiffSecond = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < minDiff) {
                    minDiff = diff;
                    minDiffFirst = arr[i];
                    minDiffSecond = arr[j];
                }
            }
        }

        System.out.println("Pair with maximum difference: " + maxDiffFirst + " and " + maxDiffSecond
                + " with difference " + maxDiff);
        System.out.println("Pair with minimum difference: " + minDiffFirst + " and " + minDiffSecond
                + " with difference " + minDiff);

        obj.close();
    }
}
