package assignmentPatterns;

import java.util.Scanner;
import java.lang.Math;
public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

/***************************** General Way ***********************************************/

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= n - 1 - i + 1; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}

/************************** When we have to run it only input times. ********************************/

/*
        int m = n/2+1;
        for(int i=1; i<=n; i++){
            if(i<=m){
                for(int j=1; j<=m-i;j++){
                    System.out.print("    ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*   ");
                }
            }
            else{
                for(int j=1;j<=i-4;j++){
                    System.out.print("    ");
                }
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*   ");
                }
            }
            System.out.println();
        }
    }
}
                                */