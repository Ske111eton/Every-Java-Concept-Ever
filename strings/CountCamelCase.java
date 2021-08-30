package strings;

import java.util.Scanner;

public class CountCamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();
        int count = 0;
        char[] arr = input.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=65 && arr[i]<=90){
                count++;
            }
        }
        System.out.println("Number of camel case:  " + count);


    }
}
