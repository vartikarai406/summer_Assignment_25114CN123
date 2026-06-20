import java.util.*;

public class StringCompression {

    public static String compress(String str) {

        String result = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i + 1 < str.length() && 
                str.charAt(i) == str.charAt(i + 1)) {

                count++;
            }
            else {
                result += str.charAt(i) + "" + count;
                count = 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Compressed string: " + compress(str));
    }
}