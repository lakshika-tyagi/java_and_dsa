public class Swap {
    static void main() {
        int a = 2, b = 4;
        System.out.println("a and b are : "+a + " " + b + " respectively.");
        swap(a,b);
        System.out.println("a and b are : "+a + " " +b + " respectively.");

        String name = "Lakshika";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String name) {
        name = name + " Tyagi";  //not changing , creating a new object
    }

    static void swap (int num1 , int num2){
        int temp = num1 ;
        num1 = num2;
        num2 = temp;
//        a = 99;
        System.out.println("a and b are : "+num1 + " " + num2 + " respectively.");
    }
}
