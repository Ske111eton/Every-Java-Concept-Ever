package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 50;
        if(a>=10 && a > 100)
            System.out.println("Number is in the range");
        else
            System.out.println("Number is not in the range");

        if((a>=10 || a > 100))
            System.out.println("Take it and go");
        else
            System.out.println("Just Goo");
    }
}
