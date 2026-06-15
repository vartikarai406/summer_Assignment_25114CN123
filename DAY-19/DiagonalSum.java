import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix:");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for(int i=0;i<n;i++){
            sum += matrix[i][i];          // main diagonal
            sum += matrix[i][n-i-1];      // secondary diagonal
        }

        // If matrix size is odd, middle element counted twice
        if(n % 2 != 0){
            sum -= matrix[n/2][n/2];
        }

        System.out.println("Diagonal Sum = " + sum);

        sc.close();
    }
}