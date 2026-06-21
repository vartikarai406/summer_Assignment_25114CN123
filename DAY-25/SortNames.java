import java.util.*;

public class SortNames {

    public static void main(String[] args) {

        String[] names = {
            "Rahul",
            "Amit",
            "Zoya",
            "Neha"
        };

        Arrays.sort(names);

        System.out.println("Sorted names:");

        for(String name : names) {
            System.out.println(name);
        }
    }
}