import java.util.Scanner;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int freq[] = new int[256];

        for(int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for(int i = 0; i < str.length(); i++) {
            if(freq[str.charAt(i)] > 1) {
                System.out.println("First repeating character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No repeating character");

        sc.close();
    }
}