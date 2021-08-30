package gcd;


import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("GCD of Two Numbers : " + gcd(num1,num2));

    }

    public static int gcd(int n1, int n2){

        int i=n1%n2;
        while(i!=0){

            n1 = n2;
            n2 = i;
            i = n1%n2;


        }

        return n2;
    }
}
