
public class StudentGradeCalculator {
    public static void main(String[] args) {

        // Student 1: Store student information
        String studentName1 = "Josh Grenninger";
        String major1 = "Applied Computer Science";
        String course1 = "CMPS 360";

        // Student 1: Declare three assignment grades
        double grade1 = 95;
        double grade2 = 88;
        double grade3 = 92;

        // Calculate the average for Student 1
        double average1 = (grade1 + grade2 + grade3) / 3;

        // Display Student 1 information and average
        System.out.println("--- Student 1 ---");
        System.out.println("Student: " + studentName1);
        System.out.println("Major: " + major1);
        System.out.println("Course: " + course1);
        System.out.printf("Average: %.2f%n", average1);

        // Determine if Student 1 passed or failed
        if (average1 >= 70) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        System.out.println();

        // Student 2: Store student information
        String studentName2 = "Jane Smith";
        String major2 = "Computer Science";
        String course2 = "CMPS 360";

        // Student 2: Declare three assignment grades
        double grade4 = 65;
        double grade5 = 58;
        double grade6 = 62;

        // Calculate the average for Student 2
        double average2 = (grade4 + grade5 + grade6) / 3;

        // Display Student 2 information and average
        System.out.println("--- Student 2 ---");
        System.out.println("Student: " + studentName2);
        System.out.println("Major: " + major2);
        System.out.println("Course: " + course2);
        System.out.printf("Average: %.2f%n", average2);

        // Determine if Student 2 passed or failed
        if (average2 >= 70) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}


