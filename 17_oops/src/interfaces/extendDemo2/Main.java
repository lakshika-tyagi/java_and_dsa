package interfaces.extendDemo2;

import interfaces.extendDemo.B;

public class Main implements A, B {

    @Override
    public void greet() {

    }

    @Override
    public void fun() {

    }

    static void main() {
        Main obj = new Main();
        A.greeting();
    }
}
