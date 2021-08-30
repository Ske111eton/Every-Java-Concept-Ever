package packageConcept.myPackage2;

import packageConcept.myPackage1.X;

public class Z extends X {
    public Z(){
        System.out.println("I am constructor from class Z : ");

//        System.out.println("n from Z " + n);
// C.T.ERROR : default

//        System.out.println("p from Z " + p);
// C.T ERROR : private

        System.out.println("q from Z " + q);     // FINE
        System.out.println("r from Z " + r);     // FINE
    }
}
