package patterns;

import java.util.Scanner;

public class ComplexPattern301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int m = n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        for(int j=1; j<=m; j++){
            for(int k=1; k<=m-j+1; k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
