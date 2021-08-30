package arrays;

import java.util.Scanner;

public class BasicQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int students = sc.nextInt();
        int[] marks = new int[students];
        int sum = 0;
        System.out.print("Enter Marks of students: ");
        for(int i=0; i<students; i++){
            marks[i] =  sc.nextInt();
        }
        for(int i=0; i<students; i++){
            sum += marks[i];
        }
        System.out.println("Average is : " + sum/students);
    }
}
