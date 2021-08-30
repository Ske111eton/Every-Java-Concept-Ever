package arrays;

import java.util.Scanner;

public class SeriesAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int n = sc.nextInt();

        int [] arr = new int[n+1];
        arr[0] = a1;
        arr[1] = a2;
        int diff = a2-a1;

        for(int i=1; i<n; i++){
            arr[i+1] = arr[i] + diff;
        }
        System.out.println(arr[n-1]);
    }
}
