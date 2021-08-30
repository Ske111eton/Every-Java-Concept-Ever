
// Q. Count Squares

//return (int)Math.sqrt(N-1);  -- Alt method to solve this Q.

package forLoops;

import java.util.Scanner;

public class NumberOfPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=1; i<N;i++){
            if(Math.sqrt(i)%1==0)
                count++;
        }
        System.out.println(count);
    }
}
