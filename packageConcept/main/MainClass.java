package packageConcept.main;

// Imported Explicitly because both packages contains class of same Name.

public class MainClass {
    public static void main(String[] args) {
        packageConcept.a.A obj1 = new packageConcept.a.A();  //Explicitly
        packageConcept.b.A obj2 = new packageConcept.b.A();  //Explicitly

        obj1.show();
        obj2.show();
    }
}
