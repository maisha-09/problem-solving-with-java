import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number of classes held: ");
        int totalClasses = obj.nextInt();

        System.out.println("Enter the number of classes attend: ");
        int attendClasses = obj.nextInt();

        double attendencePercentage = ((double) attendClasses / totalClasses) * 100;

        System.out.println("Percentage of attended class: " + attendencePercentage + "%");

        System.out.println("Do you have any medical issue: (Y/N)");
        char medicalIssue = obj.next().charAt(0);

        if (medicalIssue == 'Y' || medicalIssue == 'y') {
            System.out.println("The student is allowed to sit on exam due to medical issue");
        } else {
            System.out.println("The student is not allowed to sit on exam");
        }

        if (attendencePercentage >= 75) {
            System.out.println("The student is allowed to attend the exam");
        } else {
            System.out.println("The studend is  not allowed to attend the exam");
        }

        obj.close();
    }

}
