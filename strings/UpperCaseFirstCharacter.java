package strings;

import java.util.Scanner;

public class UpperCaseFirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char [] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                arr[i+1] = Character.toUpperCase(arr[i+1]);
            }
        }
        arr[0] = Character.toUpperCase(arr[0]);

        for(char ch : arr){
            System.out.print(ch);
        }


    }
}
