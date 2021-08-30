package switchCaseStatements;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.print("Operation to perform : ");
        sc.nextLine();
        char op = sc.nextLine().charAt(0);
        switch(op){
            case '+':
                System.out.println("Sol. " + a + " + " + b  + " = " + (a+b));
                break;
            case '-':
                System.out.println("Sol. " + a + " - " + b  + " = " + (a-b));
                break;
            case '*':
                System.out.println("Sol. " + a + " * " + b  + " = " + (a*b));
                break;
            case '/':
                System.out.println("Sol. " + a + " / " + b  + " = " + (a/b));
                break;
            case '%':
                System.out.println("Sol. " + a + " % " + b  + " = " + (a%b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
