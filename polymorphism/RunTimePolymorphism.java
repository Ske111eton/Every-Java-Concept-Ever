package polymorphism;

import org.w3c.dom.ls.LSOutput;

class Animal{

}
class Pet extends  Animal{
    public void walk(){
        System.out.println("Pet is walking");
    }
}
class Dog extends Pet{
    public void walk(){
        System.out.println("Dog is walking");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Dog d = new Dog();
        Pet p = new Dog();
        d.walk();
        p.walk();  // It is checking at the run time, which function to execute
    }
}
