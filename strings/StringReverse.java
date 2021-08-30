package strings;

import java.util.Locale;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] arr = s.toCharArray();



        String ini = "";
        String res = "";
        for(int i=0; i<arr.length; i++){
            ini += arr[i];
        }
        for(int i=arr.length-1; i>=0; i--){
            res += arr[i];
        }
        System.out.println(res);
        boolean check = false;
        if(ini.equals(res)){
            check = true;
        }
        if(check){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
