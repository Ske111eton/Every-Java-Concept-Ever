package strings;

import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isCorrect = false;
        char[] arr = s.toCharArray();

        if(arr.length <2){
            isCorrect = true;
        }
        else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] == arr[i]) {
                    isCorrect = true;
                    continue;
                } else {
                    isCorrect = false;
                    break;
                }
            }
        }
            if (isCorrect) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

    }
}
