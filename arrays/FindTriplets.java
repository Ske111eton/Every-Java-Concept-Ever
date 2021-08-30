package arrays;

import java.util.Scanner;

public class FindTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean isTrue = false;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        isTrue = true;
                        break;
                    }
                }
                if(isTrue){
                    break;
                }
            }
            if(isTrue){
                break;
            }
        }
        System.out.println(isTrue);
    }
}
