package strings;

import java.util.*;

class Solution{
    public static long findSum(String s){

        long sum = 0;
        String temp = "0";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                temp += ch;
            }
            else{
                sum += Integer.parseInt(temp);
                temp = "0";
            }

        }
        return sum + Integer.parseInt(temp);
    }
}

public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(Solution.findSum(s));

    }
}
