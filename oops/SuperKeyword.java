package oops;

class Phone{
    public Phone(){
        System.out.println("Inside Phone Constructor.");
    }
    public void fun(){
        System.out.println("It is smooth");
    }
}
class OnePlus extends Phone{

    public OnePlus(){
        super();
        System.out.println("Inside OnePlus Constructor.");
    }
    public void hello(){
        super.fun();
        System.out.println("This is also smooth.");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        OnePlus obj = new OnePlus();
        obj.hello();
    }
}
