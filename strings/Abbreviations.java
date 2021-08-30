package strings;

import java.util.Scanner;

public class Abbreviations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name : ");
        String s = sc.nextLine();

        String [] arr = s.split(" ");

        String res = "";

        res = res + arr[0].charAt(0) + ". ";
        res = res + arr[1].charAt(0) + ". ";
        res = res + arr[2];

        System.out.println("Your name : " + res);

    }
}
