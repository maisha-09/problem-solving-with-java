
public class eleven {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = -1;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("The subarray with the maximum sum is between indexes " + start + " and " + end);
    }
}
