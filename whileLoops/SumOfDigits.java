package whileLoops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int temp = n;
        int lastDigit;
        int sum = 0;
        while(temp>0){
            lastDigit = temp%10;
            temp /= 10;
            sum += lastDigit;
        }
        System.out.println("The sum of all digits is : " + sum);
    }
}
