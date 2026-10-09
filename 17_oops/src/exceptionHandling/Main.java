package exceptionHandling;

import java.io.IOException;

public class Main {
    static void main() {
        int a = 5;
        int b = 0;
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index is out of bounds");
        } catch (Exception e) {
            System.out.println("normal exception");
        } finally {
            System.out.println("this will always execute !");
        }

    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("please do not divivde by zero");
        }
        return a / b;
    }
}
