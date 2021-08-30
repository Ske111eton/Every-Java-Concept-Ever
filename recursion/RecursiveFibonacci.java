package recursion;

public class RecursiveFibonacci {
    int n;
    int fibonacci(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return (fibonacci(n-1) + fibonacci(n-2));
    }
    public static void main(String[] args) {
        RecursiveFibonacci x = new RecursiveFibonacci();
        x.n = 8;
        for(int i=0; i<=x.n; i++){
            System.out.print(x.fibonacci(x.n) + " ");
        }
    }
}

