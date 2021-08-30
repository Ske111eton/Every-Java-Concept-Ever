package oops;

class Vehicle{
    int wheels;
    int headLights;
    String color;
    Vehicle(){
        wheels = 4;
        headLights = 2;
    }
    Vehicle(int noOfWheels, int noOfHeadLights){
        wheels = noOfWheels;
        headLights = noOfHeadLights;
    }
    Vehicle(int wheels, String color){
        this.wheels = wheels;
        this.color = color;
    }
}

public class Constructors {
    Constructors(){
        System.out.println("Object is now created ! ");
    }

    public static void main(String[] args) {
        Constructors obj = new Constructors();
        Vehicle car = new Vehicle();
        Vehicle truck = new Vehicle(8,4);
        Vehicle tesla = new Vehicle(4, "Black");
        Vehicle eRikshaw = new Vehicle(3,"Yellow");

        System.out.println( "My car has " + car.wheels + " wheels ! ");
        System.out.println("My truck has " + truck.wheels + " wheels ! " + " and " + truck.headLights);
        System.out.println("Tesla has "+ tesla.wheels + " wheels and is of " + tesla.color + " color.");
        System.out.println("E Rikshaw : " + eRikshaw.color + "  " +  eRikshaw.wheels);
    }

}
