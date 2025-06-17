import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

      
        word = word.toLowerCase();

        int vowelCount = 0;

        System.out.print("Vowels found: ");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
                vowelCount++;
            }
        }

        System.out.println("\nTotal number of vowels: " + vowelCount);

        scanner.close();
    }
}
