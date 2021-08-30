package oops;

class Person{
    protected String name;
    public void walk(){
        System.out.println("Person " + name + " is walking");
    }
    public void eat(){
        System.out.println("Person " + name + " is eating");
    }
    public static void laughing(){   //It is related to class as it is static
        System.out.println("person is laughing");
    }
}


class Teacher extends Person{    // Inheritance.
    public void eat(){      //Method overriding.
        System.out.println("teacher " + name + " is eating");
    }
    public void teach(){
        System.out.println(name +" is teaching");
    }
    public static void laughing(){  //It is related to class as it is static
        System.out.println("teacher is laughing");
    }
}


class Singer extends Person{  // Inheritance.
    public void sing(){
        System.out.println(name + " is singing");
    }
    public void eat(){    //Method overriding.
        System.out.println("singer " + name + " is eating");
    }
    public static void laughing(){   //It is related to class as it is static
        System.out.println("singer is laughing");
    }
}


public class Inheritance {
    public static void main(String [] args){

        Person p = new Person();
        p.name = "Mr. Alan";
        p.eat();
        p.walk();
        System.out.println();
        Teacher t = new Teacher();
        t.name = "Mr. Harry";
        System.out.println(t.name);
        t.teach();
        t.eat();
        t.walk();
        System.out.println();
        Singer s = new Singer();
        s.name = "Ms. Harmony";
        s.sing();
        s.eat();
        s.walk();
    }
}
