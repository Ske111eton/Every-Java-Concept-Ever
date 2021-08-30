/*
Series = 1 + 1/2 + 1/3 + 1/4 + 1/5 +...........+ 1/n
*/
package forLoops;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        float sum = 1;
        for(float i=2;i<=n;i++){
            sum += 1/i;
        }
        System.out.println("Your Sum of the Series : " + sum);
    }
}
