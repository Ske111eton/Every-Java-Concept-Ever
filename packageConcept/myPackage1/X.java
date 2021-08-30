package packageConcept.myPackage1;

public class X {
    int n = 1;           //this default will be public as class is Public.
    private int p = 2;
    protected int q = 3;
    public int r = 4;

    public X(){
        System.out.println("I am constructor from class X : ");
        System.out.println("n = "+ n);
        System.out.println("p = "+ p);
        System.out.println("q = "+ q);
        System.out.println("r = "+ r);
    }
}
