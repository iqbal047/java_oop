package problem_solving3;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int m, n, p, q, sum = 0, c, d, k;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of first matrix");
        m = in.nextInt();
        n = in.nextInt();
        int first[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");
        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                first[c][d] = in.nextInt();

        System.out.println("Enter the number of rows and columns of second matrix");
        p = in.nextInt();
        q = in.nextInt();

        if (n != p) {
            System.out.println("Matrices with entered orders can't be multiplied with each other.");
        } else {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q]; // ✅ Declare before use

            System.out.println("Enter the elements of second matrix");
            for (c = 0; c < p; c++)
                for (d = 0; d < q; d++)
                    second[c][d] = in.nextInt();

            // Matrix multiplication logic
            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++) {
                    sum = 0; // ✅ Reset sum before calculation
                    for (k = 0; k < n; k++) // ✅ Should iterate `n` times, not `p`
                        sum += first[c][k] * second[k][d];

                    multiply[c][d] = sum; // ✅ Correct placement
                }
            }

            // Print the multiplied matrix
            System.out.println("Product of entered matrices:");
            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++)
                    System.out.print(multiply[c][d] + "\t");
                System.out.println();
            }
        }

        in.close(); // ✅ Close scanner
    }
}
