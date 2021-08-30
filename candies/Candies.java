package candies;

import java.util.Arrays;
import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] rating = new int [n];

        for(int i=0; i<n; i++) {
            rating[i] = sc.nextInt();
        }

        int [] candy = new int[n];
        Arrays.fill(candy,1);

        for(int i=0; i<n-1; i++){
            if(rating[i+1]>rating[i])
            {
                candy[i+1] = candy[i]+1;
            }
        }
        for(int i=n-1; i>0; i--){
            if(rating[i-1] > rating[i]){
                candy[i-1] = Math.max(candy[i-1],candy[i] + 1);
            }
        }
        int min = 0;
        for(int i=0; i<n; i++){
            min += candy[i];
            System.out.print(candy[i] + " ");
        }
        System.out.println();
        System.out.println("Minimum Candy required : " + min);
    }
}
