package arrays;
import java.util.Scanner;
public class CompleteTheSkills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[3];
        int [] b = new int[3];
        for(int i=0;i<3;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<3; i++){
            b[i] = sc.nextInt();
        }
        int a1 = 0;
        int b1 = 0;
        int [] result = new int[2];
        for(int i=0; i<3; i++){
            if(a[i] > b[i]){
               a1++;
            }
            else if(a[i] < b[i]){
                b1++;
            }
        }
        result[0] = a1;
        result[1] = b1;
        for(int items : result) {
            System.out.print(items + " ");
        }
    }
}