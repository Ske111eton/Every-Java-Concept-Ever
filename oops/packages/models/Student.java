package oops.packages.models;

public class Student {
    public String name;

    public Student(String name){
        this.name = name;
    }
    public String getName(){
        getPassword();
        return name;
    }
    String getPassword(){
        System.out.println("Hi");
        return "1341241234";
    }
}
