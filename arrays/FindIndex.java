package arrays;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int [] result = new int[2];
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                result[0] = i;
                break;
            }
            else if(arr[i] != key){
                result[0] = -1;
            }
        }
        for(int i=n-1; i>=0; i--){
            if(arr[i] == key){
                result[1] = i;
                break;
            }
            else if(arr[i] != key){
                result[1] = -1;
            }
        }
        for(int i=0; i<2; i++){
            System.out.print(result[i]+ " ");
        }

    }
}
