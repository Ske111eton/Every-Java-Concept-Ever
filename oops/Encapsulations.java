package oops;

public class Encapsulations {
    public static void main(String[] args){

        Student obj = new Student();
        obj.setAge(19);
        System.out.println(obj.getAge());

        obj.setName("Tushar");
        System.out.println(obj.getName());
    }
}
