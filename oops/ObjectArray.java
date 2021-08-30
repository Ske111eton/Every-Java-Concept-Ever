package oops;

class Balance{
    String name;
    double bal;

    Balance(String name, double bal){
        this.name = name;
        this.bal = bal;
    }
    void show(){
        if(bal<0){
            System.out.println(name + " : Account is dead");
        }
        else{
            System.out.println(name + " : "  + bal);
        }
    }
}
public class ObjectArray {
    public static void main(String[] args) {
            Balance [] current = new Balance[3];
            current[0] = new Balance("Alan",-1000.00);
            current[1] = new Balance("Walker",2000.00);
            current[2] = new Balance("KSI",6000.00);
            for(int i=0; i<3; i++) {
                current[i].show();
            }
    }
}