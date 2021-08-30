package multiDimensionalArrays;

import java.util.Scanner;

public class MultiplyingTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions for 1st Matrix : ");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int [][] a = new int[rows1][cols1];

        System.out.println("Enter the dimensions for 2nd Matrix : ");
        int rows2 = sc.nextInt();
        int cols2 =sc.nextInt();
        int [][] b = new int[rows2][cols2];

        int [][] result = new int[rows1][cols2];

        if(cols1 != rows2){
            System.out.println("Can't Multiply !!! ");
        }
        else{

            System.out.println("Enter elements of a : ");
            for(int i=0; i<rows1; i++){
                for(int j=0; j<cols1; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements of b : ");
            for(int i=0; i<rows2; i++){
                for(int j=0; j<cols2; j++){
                    b[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<rows1; i++){
                for(int j=0; j<cols2; j++) {
                    for (int k = 0; k < rows2; k++) {
                        result[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Multiplication of a and b is : ");
            for(int i=0; i<rows1; i++){
                for(int j=0; j<cols2; j++){
                    System.out.print(result[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
