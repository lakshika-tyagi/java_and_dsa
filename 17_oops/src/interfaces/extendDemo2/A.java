package interfaces.extendDemo2;

public interface A {
    //    static interface method should always have a body
    static void greeting() {
        System.out.println("hey i am a static method");
    }

    default void fun() {
        System.out.println("I am in A");
    }
}
