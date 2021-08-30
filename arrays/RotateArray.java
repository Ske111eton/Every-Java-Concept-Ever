package arrays;
import java.util.*;
import java.lang.*;

public class RotateArray{
    void leftRotate(int[] arr, int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotateByOne(arr, n);
    }

    void leftRotateByOne(int [] arr, int n)
    {
        int i, temp;
        temp = arr[0];

        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
    void printArray(int [] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int d = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            RotateArray rotate = new RotateArray();

            rotate.leftRotate(arr, d, n);
            rotate.printArray(arr, n);
        }
    }
}