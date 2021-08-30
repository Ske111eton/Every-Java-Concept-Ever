package multiDimensionalArrays;

import java.util.Scanner;

public class SumOfBothDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int [][] mat = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<n; i++){
            sum1 += mat[i][i];
            sum2 += mat[i][n-i-1];
            }
        System.out.println("Sum of both diagonals : " + (sum1+sum2));
    }
}
