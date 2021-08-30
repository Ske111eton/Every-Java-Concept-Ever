package interfaces;

interface Shape{
    int a = 10;
    void draw();
    void resize();
}

class Circle implements Shape{
    public void draw(){

    }
    public void resize(){

    }
}
class Line implements Shape{
    public void draw(){

    }
    public void resize(){

    }
}

class Rectangle implements Shape{
    public void draw(){

    }
    public void resize(){

    }
}

class Square extends Rectangle{
   public void draw(){

   }
   public void resize(){

   }
}

public class MainClass {
    public static void main(String[] args) {
        System.out.println(Shape.a);
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
        Shape t;      // Creating reference variable for interface
        t = c;      // Casting


    }
}
