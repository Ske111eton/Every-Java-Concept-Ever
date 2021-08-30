package forLoops;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int a = 0 , b = 1;
        int result ;
        System.out.print("Fibonacci Series : " + a +" "+ b +" ");
        for(int i=1; i<=n-2 ; i++){
            result = a+b;
            a = b;
            b = result;
            System.out.print(+ result + " ");
        }
    }
}
