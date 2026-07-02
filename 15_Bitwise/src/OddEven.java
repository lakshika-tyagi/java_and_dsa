public class OddEven {
    static void main() {

        int n = 100;
        boolean check= even(249);
        if(check) System.out.println("it is even");
        else System.out.println("it is odd");
    }

    static boolean even(int num){
        return (num&1) == 0;
    }
}