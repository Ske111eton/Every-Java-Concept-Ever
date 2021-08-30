package whileLoops;

import java.util.Scanner;

public class Replace0with5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int temp = n;
        while(temp>0){
            int lastDigit = temp%10;
            temp /= 10;

            if(lastDigit == 0){
                lastDigit = 5;
            }
            num = num * 10 + lastDigit;
        }
        int temp2 = num;
        int res = 0;
        while(temp2>0){
            int lastDigit = temp2%10;
            temp2 /= 10;
            res = res*10+lastDigit;
        }
        System.out.println(res);
    }

}
