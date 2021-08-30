package forLoops;

import java.util.Scanner;

public class SumOfOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        int [] result = new int[2];

        for(int i=1; i<=n; i++){
            if(i%2==0){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
        }
        result[0] = sumOdd;
        result[1] = sumEven;

        for(int i=0; i<2; i++){
            System.out.print(result[i] + " ");
        }
    }
}
