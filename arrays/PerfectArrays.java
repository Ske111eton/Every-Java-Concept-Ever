package arrays;
import java.util.Scanner;

public class PerfectArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        boolean isEquals = true;
        for(int i=0; i<n/2; i++){
            if(arr[n-i-1]  != arr[i]){
                isEquals = false;
                break;
            }
        }
        System.out.println(isEquals);
    }
}
