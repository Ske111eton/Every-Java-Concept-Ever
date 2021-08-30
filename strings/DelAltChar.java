package strings;

import java.util.Scanner;

public class DelAltChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] arr = input.toCharArray();
        String output = "";
        for(int i=0; i<arr.length; i++){
            if (i % 2 == 0) {
                output += arr[i];
            }
        }
        System.out.println(output);

    }
}
