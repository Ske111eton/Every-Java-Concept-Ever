package oops;

class Animal{
    String name;
    protected  void walk(){
        System.out.println("Walk Animal");
    }
}
class Cats extends Animal{
    protected void walk()
    {
        System.out.println("Walk Cat");
    }
}

public class UpAndDownCasting {
    public static void main(String[] args) {
        Animal a = new Cats(); //Upcasting        // DOWN      STEP-I
        Cats c = (Cats) a;                        // CASTING   STEP-II

        //Using upcasting we can call overridden methods of child class.

    }
}
