/////////////////////// Using two pointers Algo ///////////////////////
package arrays;
import java.util.Arrays;
import java.util.Scanner;
class Solution{
    public boolean findTriplet(int[]arr , int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            if (twoSum(arr, -arr[i], i + 1)) {
                return true;
            }
        }
        return false;
    }
    /////////////////// Using two pointers Algo ///////////////////////
    public boolean twoSum(int []a, int x, int i){
        int j = a.length-1;
        while(i<j){
            if(a[i]+a[j]>x){
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
public class FindTripletsOptimize{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Solution ans = new Solution();
//        System.out.println(ans.findTriplet(arr, n));
        if(ans.findTriplet(arr,n) == true){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}