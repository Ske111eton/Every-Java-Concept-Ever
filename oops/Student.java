package oops;

public class Student {
   private int age;
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
       return age;
   }
   public void setAge(int age) {
       if (age > 20) {
           System.out.println("You are too old to be a student ");
       } else {
           this.age = age;
       }
   }
}
