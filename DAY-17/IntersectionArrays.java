import java.util.*;

public class IntersectionArrays {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,5,6,7};

        Set<Integer> set1 = new HashSet<>();

        for(int i : arr1) {
            set1.add(i);
        }


        Set<Integer> intersection = new LinkedHashSet<>();

        for(int i : arr2) {

            if(set1.contains(i)) {
                intersection.add(i);
            }
        }


        System.out.println("Intersection:");
        System.out.println(intersection);
    }
}