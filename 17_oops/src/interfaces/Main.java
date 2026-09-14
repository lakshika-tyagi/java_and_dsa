package interfaces;

public class Main {
    static void main() {
        Engine car = new Car();
//        car.a;   //cannot access
        car.acc();
        car.start();
        car.stop();
//        car.brake();   //cannot access

        Media carMedia = new Car();
        carMedia.stop();
    }
}
