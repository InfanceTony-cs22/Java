import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // Sum the lengths of A and B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // Determine if A is lexicographically greater than B
        String comparisonResult = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(comparisonResult);

        // Capitalize the first letter in A and B and print them
        String capitalizedA = capitalizeFirstLetter(A);
        String capitalizedB = capitalizeFirstLetter(B);
        System.out.println(capitalizedA + " " + capitalizedB);
    }

    // Helper method to capitalize the first letter of a string
    private static String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

