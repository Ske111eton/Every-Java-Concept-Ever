package conditionalStatements;

public class ElseIfStatement {
    public static void main(String[] args) {
        int num = 33;
        if(num>=0 && num <=10){
            System.out.println("HaHaHa");
        }else if(num>10 && num <=20 ) {
            System.out.println("NaNaNa");
        }else if(num>20 && num <=30){
            System.out.println("JaJaJa");
        } else{
            System.out.println("Hey Man!");
        }
    }
}
