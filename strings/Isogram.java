package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Isogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char [] arr = s.toCharArray();
        ArrayList<Character> check = new ArrayList<>();
        boolean isIsogram = true;
        for(int i=0; i<s.length(); i++){
            if(check.contains(arr[i])){
                isIsogram = false;
                break;
            }
            else {
                check.add(arr[i]);
            }
        }

        System.out.println(isIsogram);

    }
}
