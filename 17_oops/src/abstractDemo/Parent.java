package abstractDemo;

public abstract class Parent {
    int age;
    //    final int value = 99; this is correct ,another method is to initialize it in constructor
    final int value;

    public Parent(int age) {
        this.age = age;
        value = 99;
    }

    static void hello() {
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is normal method");
    }

//    abstract public Parent(int age);   //gives error

    abstract void career();

    abstract void partner();
}
