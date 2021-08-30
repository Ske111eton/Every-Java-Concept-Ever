package abstractClasses;

public class MainClass {
    public static void main(String[] args) {

        Geometry[] obj = new Geometry[3];
        obj[0] = new Circle(2.0);
        obj[1] = new Rectangle(1.0,3.0);
        obj[2] = new Ellipse(4.0,2.0);

        double totalArea = 0;
        for(int i=0; i<3; i++){
            totalArea += obj[i].area();
        }
        System.out.println("Total Area : " + totalArea);
    }
}

