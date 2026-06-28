public class Fibonacci {
    static void main() {
        System.out.println(fib(7));
        System.out.println(fib(-9));
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(5));
        System.out.println(fib(10));
    }

    static int fib(int n){
        if(n < 0)return -1;
        if(n == 0)return 0;
        if(n == 1 || n == 2)return 1;
        return fib(n-1) + fib(n-2);
    }
}
