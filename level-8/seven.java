
public class seven {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 78, 23, 56, 89, 34, 67 };

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
