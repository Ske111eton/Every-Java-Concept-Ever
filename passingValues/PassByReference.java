package passingValues;

class Point{
    int x;
    int y;
    public void change(Point p){
        p.x = 20;
        p.y = 10;
    }
}

public class PassByReference {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;
        System.out.println("p1.x = " + p1.x + " , p1.y = " + p1.y);
        p1.change(p1);
        System.out.println("p1.x = " + p1.x + " , p1.y = " + p1.y);


    }
}
