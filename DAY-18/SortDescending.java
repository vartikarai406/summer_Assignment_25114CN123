import java.util.*;

public class SortDescending {

    public static void main(String[] args) {

        int[] arr = {5, 9, 1, 7, 3};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Descending Order:");

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}