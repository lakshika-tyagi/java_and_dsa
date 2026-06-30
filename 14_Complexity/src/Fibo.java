public class Fibo {

    static void main() {

        System.out.println(fibo(10));
        System.out.println(fibo(0));

    }

    static int fibo(int n){
        if(n < 2)return n;
        return fibo(n-1) + fibo(n-2);
    }
}