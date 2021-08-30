package methods;



public class Introduction {
    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 230;
        int result = maxOf(num1,num2);
        System.out.println(result);
        System.out.println(maxOf(33,34));

        sayHi();
        sayHi();
        maxOf(1,2);
        maxOf();
    }

    static int maxOf(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }
    static int maxOf(){
        System.out.println("Hahaa");
        return 0;
    }
    static void sayHi(){
        System.out.println("Hi");
        System.out.println("Good Morning");
    }
}
