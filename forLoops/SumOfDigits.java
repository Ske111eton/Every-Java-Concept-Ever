package forLoops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int numberOfDigits = (int)Math.log10(n)+1;
        int temp = n;
        int sum=0;
        int lastDigit;

        for(int i=1; i<=numberOfDigits; i++){
            lastDigit = temp%10;
            temp /= 10;
            sum += lastDigit;
        }
        System.out.println("Your Sum is : "+ sum);
    }
}
