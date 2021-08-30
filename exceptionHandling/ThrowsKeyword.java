package exceptionHandling;

public class ThrowsKeyword {
    public static void main(String[] args) {
        fun1();
    }
    static void fun1(){

        int a = 5;
        int b = 4;
        System.out.println(a/b);
        try {
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e.getMessage() + " has been Handled");
        }
    }
    static void fun2() throws ArrayIndexOutOfBoundsException{
        boolean isDanger = true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("Danger");
        }

    }
}
