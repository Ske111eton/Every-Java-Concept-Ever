package forLoops;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num<2)
            isPrime = false;
        for(int i=2 ; i< Math.sqrt(num) ; i++) //refer notes to understand
        {                                      //You can directly use "num" instead of Math.sqrt(num)
            if(num%i==0)
            {
                isPrime = false;
                break;
            }
            else{
                isPrime = true;
            }
        }
        if(isPrime==true){
            System.out.println("Number is Prime!");
        }
        else
        {
            System.out.println("Number is not prime!");
        }
//        System.out.println("Number is not prime");
    }
}

