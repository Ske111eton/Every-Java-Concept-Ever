package multiDimensionalArrays;

import java.util.Scanner;

public class AddingTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimensions : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] a = new int[rows][cols];
        int [][] b = new int[rows][cols];
        int [][] result = new int[rows][cols];

        System.out.println("Enter elements of a : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of b : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of a and b is : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
