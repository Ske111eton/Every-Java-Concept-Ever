package strings;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String s1 = sc.nextLine();
        System.out.print("Enter 2nd String : ");
        String s2 = sc.nextLine();
        boolean isAnagram = false;

        if(s1.length() == s2.length()) {
            boolean [] isVisited = new boolean[s1.length()];
            for (int i = 0; i < s1.length(); i++){
                isAnagram = false;
                char c1 = s1.charAt(i);
                for(int j=0; j<s2.length(); j++){
                    char c2 = s2.charAt(j);
                    if(c1 == c2 && !isVisited[j]){
                        isVisited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if(!isAnagram){
                    break;
                }
            }
        }
        if(isAnagram){
            System.out.println("Strings are anagram of each other.");
        }
        else{
            System.out.println("Strings are not anagrams.");
        }
    }
}
