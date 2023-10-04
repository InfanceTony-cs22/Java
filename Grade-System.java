import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the student's score
        System.out.print("Enter the student's score: ");
        double score = scanner.nextDouble();

        // Determine the grade based on the score
        char grade;

        if (score >= 95 && score <= 100) {
            grade = 'O';
        } else if (score >= 90 && score < 95) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'A';
        } else if (score >= 70 && score < 80) {
            grade = 'B';
        } else if (score >= 60 && score < 70) {
            grade = 'B';
        } else if (score >= 50 && score < 60) {
            grade = 'C';
        } else {
            grade = 'F'; // F for Fail
        }

        // Print the grade
        System.out.println("The student's grade is: " + grade);

        scanner.close();
    }
}
