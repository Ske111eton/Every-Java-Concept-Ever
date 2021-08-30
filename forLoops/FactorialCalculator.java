package forLoops;
import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int result = 1;
        for(int i = num ; i > 0 ; i--)
        {
            result*= i;
        }
        System.out.println(num + "! = " + result);
    }
}
