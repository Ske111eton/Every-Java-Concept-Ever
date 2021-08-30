package arrays;

import java.util.Scanner;

public class AverageInAStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        float [] result = new float[n];
        float ans = 0f;
        float count = 1;
        for(int i=0; i<n; i++){
            ans += arr[i];
            result[i] = (ans/count);
            count++;
        }
        for(float items : result){
            System.out.print(items + " ");
        }
    }
}
