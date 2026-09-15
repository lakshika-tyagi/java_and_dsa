package interfaces;

public class Main {
    static void main() {
        Engine car = new Car();
//        car.a;   //cannot access
        car.acc();
        car.start();
        car.stop();
//        car.brake();   //cannot access
        System.out.println();

        Media carMedia = new Car();
        carMedia.stop();
        System.out.println();

        NiceCar car1 = new NiceCar();
        car1.start();
        car1.startMusic();
        car1.upgradeEngine();
        car1.start();
    }
}
