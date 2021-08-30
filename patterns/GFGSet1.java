package patterns;

import java.util.Scanner;

public class GFGSet1 {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n;i++)
        {
            int count = n;
            int temp = n;
            while (temp-- > 0) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print(count + " ");
                }
                count--;
                }
            System.out.println();
        }
        }
}
