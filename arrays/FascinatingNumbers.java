package arrays;

import java.util.Scanner;

public class FascinatingNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int noOfDigits = (int)Math.log10(n)+1;


        if(noOfDigits < 3){
            System.out.println("Invalid number !");
        }
        else{
            int num1 = n*2;
            int num2 = n*3;
            String s = Integer.toString(n);
            String s1 = Integer.toString(num1);
            String s2 = Integer.toString(num2);
            String sum = s + s1 + s2;
            int result = Integer.parseInt(sum);

            System.out.println(result);
            int noOfDigits2 = (int)Math.log10(result) + 1;
            boolean isFascinating = false;
if(noOfDigits2 == 9) {
    int temp = result;
    int[] arr = new int[noOfDigits2];
    int i = 0;
    while (temp > 0) {
        int lastDigit = temp % 10;
        temp /= 10;
        arr[i] = lastDigit;
        i++;
    }
    for (int j = 0; j < noOfDigits; j++) {
        System.out.print(arr[j]);
    }
    System.out.println();
    for (int j = 0; j < noOfDigits2 - 1; j++) {
        for (int k = 0; k < noOfDigits2 - 1; k++) {
            if (arr[k + 1] < arr[k]) {
                int tempro = arr[k + 1];
                arr[k + 1] = arr[k];
                arr[k] = tempro;
            }
        }
    }

    for (int items : arr) {
        System.out.print(items);
    }
    System.out.println();

    int count = 1;
    for (int j = 0; j < noOfDigits2; j++) {
        if (arr[j] == count) {
            isFascinating = true;
            count++;
        } else {
            isFascinating = false;
            break;
        }
    }
    System.out.println(isFascinating);
}
else
    isFascinating = false;

        }
    }
}
