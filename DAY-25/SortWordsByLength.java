import java.util.*;

public class SortWordsByLength {

    public static void main(String[] args) {

        String[] words = {
            "Java",
            "C",
            "Python",
            "HTML",
            "SQL"
        };

        Arrays.sort(words, new Comparator<String>() {

            public int compare(String a, String b) {
                return a.length() - b.length();
            }

        });

        System.out.println("Words sorted by length:");

        for(String word : words) {
            System.out.println(word);
        }
    }
}