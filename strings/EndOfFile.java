package strings;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";
        int count = 1;
        while(sc.hasNext()){
            line = sc.nextLine();
            System.out.println(count + " "  + line);
            count++ ;
        }
    }
}
