import java.util.*;

public class CommonCharacters {

    public static void main(String[] args) {

        String s1 = "apple";
        String s2 = "plane";

        HashSet<Character> set = new HashSet<>();

        for(char c : s1.toCharArray()) {
            set.add(c);
        }

        System.out.print("Common characters: ");

        for(char c : s2.toCharArray()) {
            if(set.contains(c)) {
                System.out.print(c + " ");
                set.remove(c);
            }
        }
    }
}