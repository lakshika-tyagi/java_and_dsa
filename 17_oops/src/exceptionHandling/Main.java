package exceptionHandling;

public class Main {
    static void main() {
        int a = 5;
        int b = 0;
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this will always execute !");
        }

    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("please do not divivde by zero");
        }
        return a / b;
    }
}
