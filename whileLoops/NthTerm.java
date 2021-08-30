package whileLoops;

import java.util.Scanner;

public class NthTerm {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 1;
        int i = 0;
        int temp = N;

        while (temp > 0) {
            arr[i] = sum;
            i++;
            sum += i + 1;
            temp--;
        }
        int result = arr[N - 1];
        System.out.println(result);
    }
}