package doWhileLoops;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0 ;

        do{
            System.out.print("Enter Value : ");
            n = sc.nextInt();
        }
        while(n!=0);
    }
}
