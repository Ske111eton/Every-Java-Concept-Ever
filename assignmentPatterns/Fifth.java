package assignmentPatterns;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*  ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
            System.out.println();
        int m = 2*n+1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*  ");
            }
            for(int j=1; j<=m-(2*i); j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
