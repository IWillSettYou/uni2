package famous.sequence;
public class Fibonacci {
    public static int fib(int n){
        if(n >= 2) return fib(n-1) + fib(n-2);
        else return n;
    }
}