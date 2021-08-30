package conditionalStatements;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first number : ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter second number : ");
//        int num2 = sc.nextInt();
//        System.out.print("Enter third number : ");
//        int num3 = sc.nextInt();
//
//        if(num1>num2 && num1>num3)
//            System.out.println(num1 + " is the Biggest");
//        else if(num2>num3)
//            System.out.println(num2 + " is the Biggest");
//        else
//            System.out.println(num3 + " is the Biggest");

        int a=12, b = 18, c = 100;
        int result = 0;

        if(a>b){
            if(a>c){
                result = a;
            }else{
                result = c;
            }
        }else{
            if(b>c){
                result = b;
            }else{
                result = c;
            }
        }
        System.out.println("Largest of the three number is : " + result);
    }
}
