package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
//        5 -> 101
//        6 -> 110
           int a = 5;
           int b = 6;
           int c = a & b;
           int d = a | b;
           int e = a ^ b;
           int f = a>>1;
           int g = a<<1;
        System.out.println("And Operator : " + c);
        System.out.println("OR Operator : " + d);
        System.out.println("XOR Operator : " + e);
        System.out.println("Right Shift Operator : " + f);
        System.out.println("Left shift Operator : " + g);
    }
}
