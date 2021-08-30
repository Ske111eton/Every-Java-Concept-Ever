package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractTheIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> res = new ArrayList<>();
        char [] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++){
        String temp = "";

            while(i<arr.length && arr[i] >= '0' && arr[i] <= '9'){
                temp = temp + arr[i];
                res.add(temp);
            }
        }
        System.out.println(res);
    }
}
