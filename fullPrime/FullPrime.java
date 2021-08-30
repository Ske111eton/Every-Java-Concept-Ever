package fullPrime;
import java.util.*;
public class FullPrime {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = false;
        int temp = n;
        for(int i=2; i<n-1; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
            else{
                isPrime = true;
            }
        }

        if(!isPrime){
            System.out.println("0");
        }
        else {

            while (temp > 0) {
                int lastDigit = temp % 10;
                temp /= 10;
                if (lastDigit < 2) {
                    isPrime = false;
                    break;
                } else {
                    for (int i = 2; i < lastDigit - 1; i++) {
                        if (lastDigit % i == 0) {
                            isPrime = false;
                            break;
                        } else {
                            isPrime = true;
                        }
                    }
                }
            }
        }
        if(isPrime){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }
}
