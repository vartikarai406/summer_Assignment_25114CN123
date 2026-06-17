import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String upper = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                upper += (char)(ch - 32);
            } else {
                upper += ch;
            }
        }

        System.out.println("Uppercase string: " + upper);
    }
}