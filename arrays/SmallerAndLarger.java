package arrays;
import java.util.Scanner;
public class SmallerAndLarger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] result = new int[2];
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<n; i++){
            if(arr[i] < x){
                count1++;
            }
            else if(arr[i] == x){
                count1++;
                count2++;
            }
            else{
                count2++;
            }
        }
            result[0] = count1;
            result[1] = count2;
            for(int i=0; i<2; i++){
                System.out.print(result[i] + " ");
            }
    }
}
