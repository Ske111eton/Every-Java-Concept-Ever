/*
Series = 1 - 1/2 + 1/3 - 1/4 + 1/5 -...........1/n
*/
package forLoops;
import java.util.Scanner;
public class SeriesSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        float result = 1f;
        for(float i=2 ; i<=n ; i++){
            if(i%2==0)
                result -= 1/i;
            else
                result += 1/i;
        }
        System.out.println("Your Answer : " + result);
    }
}
