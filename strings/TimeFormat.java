package strings;

import java.util.Scanner;
public class TimeFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        if (s.substring(0, 2).equals("12") && s.contains("AM")) {
            str = "00";
            s = str + s.substring(2);
        }
        if (!s.substring(0, 2).equals("12") && s.contains("PM")) {
            str = Integer.toString(Integer.parseInt(s.substring(0, 2)) + 12); //Imp Line for me.
            s = str + s.substring(2);
        }
        System.out.println(s.substring(0, s.length() - 2));
    }
}
