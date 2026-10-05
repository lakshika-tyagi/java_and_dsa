package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

//        arr.forEach((item) -> {
//            System.out.println(item * 2);
//        });

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation product = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        LambdaFunctions calc = new LambdaFunctions();
        System.out.println(calc.operate(5, 3, sum));
    }

    int sum(int a, int b) {
        return a + b;
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}
