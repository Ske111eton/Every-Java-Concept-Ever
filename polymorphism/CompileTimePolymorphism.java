package polymorphism;


public class CompileTimePolymorphism {
    public static void main(String[] args) {
        greetings();
        greetings("What have you been up to");
        greetings("Good evening ",5);
    }
    public static void greetings(){
        System.out.println("Hi, there");
    }
    public static void greetings(String s){
        System.out.println(s);
    }
    public static void greetings(String s, int count){
        for(int i=0; i<count; i++){
            System.out.println(s);
        }
    }
}
