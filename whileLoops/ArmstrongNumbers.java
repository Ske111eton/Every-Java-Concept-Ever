package whileLoops;
import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        int sum = 0;
        while(temp>0){
            int lastDigit = temp%10;
            temp /= 10;

            sum = sum + (lastDigit * lastDigit * lastDigit);
        }
        System.out.println(sum);
        if(sum == n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
