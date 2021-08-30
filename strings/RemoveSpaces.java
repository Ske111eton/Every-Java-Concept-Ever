package strings;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
        String input = "geeks  for geeks";
        System.out.println(input.replaceAll(" ",""));

//        String input = "      g f g" ;
//        String[] arr = input.trim().split(" ");
//        for(String items : arr){
//            System.out.print(items);

    }
}
