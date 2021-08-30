package guessingGame;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int guess;
        int secretNum = 7;

        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=3; i++)
        {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if(guess == secretNum) {
                System.out.println("You Won");
                break;
            }
            else if(i>=3)
                System.out.println("You lost");
            else
                continue;
        }

    }
}
