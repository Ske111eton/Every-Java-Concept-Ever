package assignmentPatterns;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        if(n<2){
            System.out.println("*");
        }
        else {
            for (int i = 1; i <= 1; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }


            for (int i = 2; i <= n - 1; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
                System.out.println();
            }

            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
        }
    }
}
