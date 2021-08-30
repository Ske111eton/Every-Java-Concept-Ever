package arrays;
import java.util.Arrays;
import java.util.Scanner;

class Answer{
    public int tripletCount(int [] arr, int n){
           Arrays.sort(arr);
           int count = 0;
           for(int i=0; i<n-2; i++){
               if(twoSum(arr, -arr[i] ,i+1)){
                 count++;
               }
           }
        return count;
    }
    public boolean twoSum(int []a, int x, int i){
        int j = a.length - 1;
        while(i<j){
            if(a[i]+a[j] > x){
                j--;
            }
            else if(a[i]+a[j] < x){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}

public class TripletWithZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Answer a = new Answer();
        System.out.println(a.tripletCount(arr,n));

    }
}

