package nestedForLoops;

public class MultiplicationTables {
    public static void main(String [] args) {
        int result;
        for(int i=1; i<=10; i++){
            for(int j=1; j<=20; j++){
                result = i*j;
                System.out.print(result +  "    ");
            }
            System.out.println();
        }
    }
}
