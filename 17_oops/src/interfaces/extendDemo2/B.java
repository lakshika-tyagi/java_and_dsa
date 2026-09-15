package interfaces.extendDemo2;

import interfaces.extendDemo.A;

public interface B {
    default void greet() {
        System.out.println("Hey , it is B interface");
    }

//    void fun();
}
