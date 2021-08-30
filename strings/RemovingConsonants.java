package strings;

import java.util.Scanner;

public class RemovingConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(remove(s));

    }
    public static String remove(String s){
        return s.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz]", "");
    }
}

