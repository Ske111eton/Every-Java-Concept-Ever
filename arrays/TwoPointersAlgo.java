package arrays;
import java.util.Scanner;

class TwoPointer{
    public static int isPairSum(int [] a,int n, int x){
        int i = 0;
        int j = n-1;
        while(i<j){
            if(a[i]+a[j] > x){
                j--;
            }
            else if(a[i]+a[j] < x){
                i++;
            }
            else{
                return 1;
            }
        }
        return 0;
    }
}
public class TwoPointersAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(TwoPointer.isPairSum(arr,n,x));
    }
}
