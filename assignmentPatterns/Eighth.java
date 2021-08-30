
/******************************* Still need to work **********************************/

package assignmentPatterns;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1; i<=1; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print("  ");
            }
            System.out.print("0 ");
            System.out.println();
        }
        int m = 10;
        int result;

        for(int i=2; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i-1; j++){
                result = m-i+1 ;
                result++;
                System.out.print(result +" ");
            }
            for(int j=1; j<=1; j++){
                System.out.print("0 ");
            }
            for(int j=1; j<=i-1;j++){
                System.out.print(m-i+1 + " ");
            }
            System.out.println();
        }

    }
}
