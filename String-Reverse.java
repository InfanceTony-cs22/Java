import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
    if (isPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }

    // Helper method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make it case-insensitive
        str = str.toLowerCase();

        // Remove spaces from the string
        str = str.replaceAll("\\s", "");

        // Compare the original string with its reverse
        return str.equals(new StringBuilder(str).reverse().toString());    
    }
}



