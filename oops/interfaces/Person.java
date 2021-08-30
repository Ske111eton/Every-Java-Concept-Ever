package oops.interfaces;

public class Person implements Student, Youtuber{
    public void study(){
        System.out.println("Person is studying");
    }
    public void makeVideo(){
        System.out.println("Person is making a good video");
    }
    public void editVideos(){
        System.out.println("Editing videos");
    }
//    public void reading(){                // We commented this funciton and o error.
//        System.out.println("Reading");
//    }
    public static void main(String[] args) {
        Person obj = new Person();
        obj.makeVideo();
        obj.study();
        Youtuber obj2 = obj;
        obj2.editVideos();
        Student s = obj;
        s.reading();

    }
}
