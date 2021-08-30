package assignmentPatterns;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt() ;

        for(int i=1; i<=1; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print("  ");
            }
            System.out.print("1 ");
            System.out.println();
        }

        for(int i=2; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            System.out.print(i + " ");
            for(int j=1; j<=2*i-3; j++){
                System.out.print("0 ");
            }
            System.out.print(i);
            System.out.println();
        }

    }
}
