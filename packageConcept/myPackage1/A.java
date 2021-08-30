package packageConcept.myPackage1;

public class A {
    A(){
        X x = new X();
        System.out.println("I am Constructor from class  A : ");
        System.out.println("n from A : " + x.n);
//        System.out.println("p from A : " + x.p);
//  C.T.ERROR : private!
        System.out.println("q from A : " + x.q); // Review Later //
        System.out.println("r from A : " + x.r);
    }
}
