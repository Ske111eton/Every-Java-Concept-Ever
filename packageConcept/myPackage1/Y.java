package packageConcept.myPackage1;

public class Y extends X {
  public Y(){
        System.out.println("I am constructor from class Y : ");
        System.out.println("n " + n);
//        System.out.println("p " + p);
//  C.T.ERROR : p is a private member of X. Not accessible outside X.
        System.out.println("a " + q);
        System.out.println("r " + r);
    }
}

