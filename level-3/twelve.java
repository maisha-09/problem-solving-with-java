public class twelve {
    public static void main(String[] args) {
        int totalStudents = 90;
        int boys = 45;

        int gradeAStudents = (int) (totalStudents * 0.50);

        int gradeABoys = 20;
        int girlsGettingGradeA = gradeAStudents - gradeABoys;

        System.out.println("Total number of girls getting grade 'A': " + girlsGettingGradeA);

    }
}
