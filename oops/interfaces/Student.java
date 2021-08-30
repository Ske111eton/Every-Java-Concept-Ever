package oops.interfaces;

public interface Student {
    void study();
    default void reading(){
        System.out.println("Hi Iam reading");
    }
}
