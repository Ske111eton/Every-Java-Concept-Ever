package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        List<String> res = new ArrayList<>();

        String S1 = "";
        String S2 = "";
        String S3 = "";

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                S1 = S1 + s.charAt(i);
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'B'){
                S1 = S1 + s.charAt(i);
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                S2 = S2 + s.charAt(i);
            }
            else{
                S3 = S3 + s.charAt(i);
            }
        }
        res.add(S1);
        res.add(S2);
        res.add(S3);

        System.out.println(res);
    }
}
