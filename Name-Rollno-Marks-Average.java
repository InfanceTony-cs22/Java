import java.util.Scanner;

class Student {
    // Instance variables to store student information
    private String name;
    private int rollNumber;
    private double[] marks = new double[5]; // Array to store marks for 5 subjects

    // Constructor to initialize student information
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to input marks for each subject
    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for " + name + " (Roll Number: " + rollNumber + "):");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
    }

    // Method to calculate and return total marks
    public double calculateTotalMarks() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " Marks: " + marks[i]);
        }
        System.out.println("Total Marks: " + calculateTotalMarks());
    }
}

public class StudentInfoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store student objects
        Student[] students = new Student[5];

        // Input student information and marks
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student roll number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            students[i] = new Student(name, rollNumber);
            students[i].inputMarks();
        }

        // Display student information and total marks
        for (Student student : students) {
            student.displayStudentInfo();
        }

        scanner.close();
    }
}
