package passingValues;

class Calc{
    protected void change(int val){
        val = val * 2;
    }
}
public class PassByValue {
    public static void main(String[] args) {
        int x = 25;
        Calc obj = new Calc();
        System.out.println(x);
        obj.change(x);
        System.out.println(x);

    }
}
