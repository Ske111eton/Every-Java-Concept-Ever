package strings;

import java.util.Arrays;
import java.util.Scanner;

class Solutions{
    public static String reverseVowels(String s){

        char [] arr = s.toCharArray();

        String str = "";
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            //left -> vowel
            while(left<right && isVowel(arr,left) == false){
                left++;
            }
            // right -> vowel
            while(left<right && isVowel(arr,right) == false){
                right--;
            }

            swap(arr,left,right);
            left++;
            right--;
        }

        for(char ch : arr){
            str += ch;
        }
        return str;
    }

    public static void swap(char [] arr, int left, int right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static boolean isVowel(char [] arr, int a){

        if(arr[a] == 'a' || arr[a] == 'e' || arr[a] == 'o' || arr[a] == 'i' || arr[a] == 'u'){
            return true;
        }
        return false;
    }
}

public class ReversingTheVowels {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        System.out.println(Solutions.reverseVowels(s));

    }
}
