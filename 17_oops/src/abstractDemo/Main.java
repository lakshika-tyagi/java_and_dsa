package abstractDemo;

public class Main {
    static void main() {
        Son son = new Son(23);
        son.career();

        Parent daughter = new Daughter(17);
        daughter.career();

//        Parent mom = new Parent();      //you cannot create object of an abstract class

        Parent.hello();
        son.normal();

    }
}
