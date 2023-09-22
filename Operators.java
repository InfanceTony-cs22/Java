public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic operators
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Comparison operators
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreaterThan = a > b;

        // Logical operators
        boolean result1 = true && false; // AND operator
        boolean result2 = true || false; // OR operator
        boolean result3 = !true;         // NOT operator

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater Than: " + isGreaterThan);
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
    }
}
