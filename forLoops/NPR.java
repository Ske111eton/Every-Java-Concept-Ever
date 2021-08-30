package forLoops;
import java.util.*;
public class NPR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        int result1 = 1;
        int denominator = n-r;
        int result2 = 1;

        for(int i=1; i<=n; i++){
            result1 *= i;
        }
        for(int i=1; i<=denominator; i++){
            result2 *= i;
        }
        System.out.println(result1/result2);
    }
}
