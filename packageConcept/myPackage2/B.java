package packageConcept.myPackage2;

import packageConcept.myPackage1.X;

public class B {
    public B() {
        X x = new X();
        System.out.println("I am Constructor from class B of myPackage2 ");
//        System.out.println("n from B : " + x.n);  //default ERROR
//        System.out.println("p from B : " + x.p);  //private ERROR
//        System.out.println("q from B : " + x.q);  //protected ERROR
        System.out.println("r from B : " + x.r);
    }
}
