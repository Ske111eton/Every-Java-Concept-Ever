package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 23;
        int b = 45;
//        int c = a*a + b*b + 2*a*b;
//        int d = (a+b) * (a+b);
        double c = a++;
        int d = ++b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);
    }
}
