import java.util.Scanner;

public class GreatestAmongTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Compare the two numbers and find the greatest
        if (num1 > num2) {
            System.out.println(num1 + " is the greatest.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the greatest.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
