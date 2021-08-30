package dataAbstraction;

abstract class Car{
    public abstract void accelerate();
    public abstract void breaking();
    public void honk(){
        System.out.println("Car is honking");
    }
}
class WagonR extends Car{
    public void accelerate(){
        System.out.println("WagonR is accelerating");
    }
    public void breaking(){
        System.out.println("WagonR os breaking");
    }
}
class Audi extends Car{
    public void accelerate(){
        System.out.println("Audi is accelerating");
    }
    public void breaking(){
        System.out.println("Audi os breaking");
    }
}
public class RepairShop{
    public static void repairCar(Car car){
        System.out.println("car is repaired");
    }
    public static void main(String[] args) {
        WagonR wagonR = new WagonR();
        Audi audi = new Audi();
        repairCar(wagonR);
        repairCar(audi);
    }
}
