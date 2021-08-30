package assignmentPatterns;

import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();


        for(int i=1; i<=1; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            System.out.println("1");
        }

        for(int i=2; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            System.out.print("1   ");
            for(int j=1; j<=i-2; j++){
                System.out.print(j +"   ");
            }
            System.out.print("1 ");
            System.out.println();
        }
    }
}
