package strings;

import java.util.Scanner;

public class RemoveAlphanumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String result = "";
        char[] arr = S.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=48 && arr[i]<=57){
                result += arr[i];
            }
        }
        System.out.print(result);
    }
}
