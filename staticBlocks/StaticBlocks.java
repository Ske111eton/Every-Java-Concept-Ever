package staticBlocks;

import java.util.Scanner;

public class StaticBlocks {

    static int br;
    static int he;

    static boolean flag = true;
    static {
        Scanner sc = new Scanner(System.in);
          br = sc.nextInt();
          he = sc.nextInt();

            if (br < 1 || he < 1) {
                flag = false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        }
    public static void main(String[] args) {
        if(flag){
            int area = br*he;
            System.out.println(area);
        }
    }
}
