import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the 1st subject number: ");
        int subject1 = obj.nextInt();

        System.out.println("Enter the 2nd subject number: ");
        int subject2 = obj.nextInt();

        System.out.println("Enter the 3rd subject number: ");
        int subject3 = obj.nextInt();

        int totalMarks = subject1 + subject2 + subject3;
        double percentageMark = (totalMarks / 300.0) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentageMark + "%");
    }
}
