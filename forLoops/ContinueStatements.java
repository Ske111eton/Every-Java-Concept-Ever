package forLoops;

public class ContinueStatements {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i>3 && i<=7){
                continue;
            }
            System.out.println(i);
        }
    }
}
