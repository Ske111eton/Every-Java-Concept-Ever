package conditionalStatements;

public class NestedTernaryOp {
    public static void main(String[] args) {
        int a=12, b = 180, c = 100;
        int maxOfThree = 0;
        maxOfThree = a>b ? a>c  ? a : c : b > c ? b : c ;
        System.out.println("Largest of the three number is : " + maxOfThree);
    }
}
