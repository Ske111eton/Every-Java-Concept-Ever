package exceptionHandling;

public class MainClass {
    public static void main(String[] args) {

        try {
            int a = 5;
            int b = 0;
            int c = a / b;
        }
         catch(ArithmeticException e){
            System.out.println(e.getMessage() + " occur, please check your code");
        }




        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index should be in range of 0 to size of array.");
        }
        finally{
            System.out.println("Sorry for the Inconvenience.");
        }
        System.out.println();
        System.out.println("Very important code");
        System.out.println("need to run");
//        fun1();
    }
    static void fun1(){
        int a = 5;
            int b = 0;
            int c = a / b;

            System.out.println(c);
    }
}
