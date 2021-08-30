//Difference between sums of odd and even digits.

package strings;

import java.util.Scanner;

public class DiffBetweenSumsOfOddEvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        long sum1 = 0;
        long sum2 = 0;

        int i=0;

        while(i<=S.length()-1){

            if(i%2==0){
                sum1 += Integer.parseInt(S.substring(i,i+1));
            }
            else{
                sum2 += Integer.parseInt(S.substring(i,i+1));
            }
            i++;
        }
        if(sum1 == sum2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
