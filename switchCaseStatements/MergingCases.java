package switchCaseStatements;

import java.util.Scanner;

public class MergingCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rating : ");
        int rating = sc.nextInt();

        switch(rating){
            case 1:
            case 2:
                System.out.println("Bad");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
            case 5:
                System.out.println("Good");
                break;
            default:
                System.out.println("Invalid Rating");
        }
    }
}
