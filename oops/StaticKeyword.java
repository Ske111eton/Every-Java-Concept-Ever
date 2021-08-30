package oops;

class Human {
    int age;
    String name;
    static String breed = "Homo Sapiens";
}

public class StaticKeyword {
    static int number;
    public static void main(String[] args) {
        System.out.println(Math.PI);
        Human obj = new Human();



        A objA = new A();
        A.B objB = objA.new B();
        A.C objC = new A.C();

    }
}
