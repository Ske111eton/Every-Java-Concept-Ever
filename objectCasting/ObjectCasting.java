package objectCasting;

class Parent{
    int age;
    protected void show(){
        System.out.println(age);
    }
}

class Child extends Parent{
    int teeth;
    protected void print(){
        System.out.println(teeth);
    }
}

public class ObjectCasting {
    public static void main(String[] args) {
        Child c = new Child();  //Upcasting...  (Implicitly)
        Parent p = c;           //// DownCasting...  (Explicitly)
        Child p1 =(Child)p;     ////..............

        System.out.println(c instanceof Child);
        System.out.println(c instanceof Parent);
        System.out.println(p instanceof Child);
        System.out.println(p instanceof Parent);
        c.age = 30;
        c.show();
        p1.teeth = 21;
        p1.print();
    }
}
