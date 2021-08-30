package recursion;

public class RecursiveGCD {
    int m, n;
    int gcd(int m, int n){
        if(m>n) return gcd(n,m);
        if(m == n) return m;
        if(m == 0) return n;
        if(m == 1) return 1;
        return gcd(m,n%m);
    }

    public static void main(String[] args) {
        RecursiveGCD g = new RecursiveGCD();
        g.m = 5;
        g.n = 10;
        System.out.print(g.gcd(g.m, g.n));
    }
}
