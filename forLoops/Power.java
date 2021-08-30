package forLoops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base Number : ");
        int baseNum = sc.nextInt();
        System.out.print("Enter it's Power : ");
        int powNum = sc.nextInt();
        int result = 1;
        for(int i=1; i<=powNum ; i++)
        {
            result *= baseNum;
        }
        System.out.println("Your Answer : " + result);
    }
}
