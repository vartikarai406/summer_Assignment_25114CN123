import java.util.*;

public class UnionArrays {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,5,6,7};

        Set<Integer> union = new LinkedHashSet<>();

        for(int i : arr1) {
            union.add(i);
        }

        for(int i : arr2) {
            union.add(i);
        }

        System.out.println("Union of Arrays:");
        System.out.println(union);
    }
}