package strings;

import java.util.Scanner;

public class CountTypesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int vov = 0;
        int cons = 0;
        int dig = 0;
        int ws = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                dig++;
            }
            else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vov++;
            }
            else if (s.charAt(i) == ' '){
                ws++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Number of vowels : " + vov);
        System.out.println("Number of consonants : " + cons);
        System.out.println("Number of digits : " + dig );
        System.out.println("Number of white space : " + ws);
    }
}
