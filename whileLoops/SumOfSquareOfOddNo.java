package whileLoops;

import java.util.Scanner;

public class SumOfSquareOfOddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        int sum = 0;

        while(n-- > 0){
            sum += Math.pow(count,2);
            count += 2;
        }
        System.out.println(sum);
    }
}
