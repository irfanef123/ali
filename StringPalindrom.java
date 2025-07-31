import java.util.Scanner;

public class StringPalindrom  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        
        
        String cleaned = original.replaceAll("\\s+", "").toLowerCase();

        
        String reversed = new StringBuilder(cleaned).reverse().toString();

        
        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

