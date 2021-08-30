package binarySearch;
import java.util.Scanner;


class Solution {
    int binarySearch(int [] arr, int n, int k){

        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = ((low+high)/2);
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid]>k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.binarySearch(a,n,k));
    }
}
