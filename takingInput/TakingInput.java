package takingInput;
import java.util.Scanner;
public class TakingInput {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        int principal = sc.nextInt();
        System.out.print("Enter rate: ");
        float rate = sc.nextFloat();
        System.out.print("Enter the time duration: ");
        int time = sc.nextInt();
        float interest = (principal * rate * time)/100;
        System.out.println("Your Simple Interest : " + interest);

    }
}
