import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {5, 6, 7, 8};

        int merged[] = new int[arr1.length + arr2.length];

        int k = 0;

        for(int i = 0; i < arr1.length; i++) {
            merged[k++] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++) {
            merged[k++] = arr2[i];
        }

        System.out.println("Merged Array: ");
        System.out.println(Arrays.toString(merged));
    }
}