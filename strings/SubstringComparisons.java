package strings;

import java.util.Locale;
import java.util.Scanner;

public class SubstringComparisons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String sub1 = s1.substring(0,1);
        String sub1a = s1.substring(1);
        String result1 = sub1.toUpperCase().concat(sub1a);

        String sub2 = s2.substring(0,1);
        String sub2a = s2.substring(1);
        String result2 = sub2.toUpperCase().concat(sub2a);


        int len1 = s1.length();
        int len2 = s2.length();

        System.out.println(len1 + len2);
        int res = s1.compareTo(s2);
        if(res<1){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        System.out.println(result1 + " " + result2);
    }
}
