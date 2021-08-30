package whileLoops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int temp = n;
        int lastDigit;
        int reverse=0;

        while(temp>0){
            lastDigit = temp%10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }
        System.out.println("Reverse of " + n +" is : " + reverse);
    }
}
