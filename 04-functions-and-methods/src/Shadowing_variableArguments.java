import java.util.Arrays;

public class Shadowing_variableArguments {
    static int x = 10 ; //this will be shadowed at line 8

    static void main() {
//        shadowing
        System.out.println(x);
        int x = 20;
        x = 30;
        System.out.println(x);
        fun_s();

//        variable arguments, varargs
        fun(2,3432,2,43,2,23,565,76,3,4,6,5,4,9);
        fun();
        multiple(2,1,"Lakshika", "Aditya", "Vashu");
    }

//    shadowing
    static void fun_s() {
        System.out.println(x);
    }

//    variable arguments
    static void fun(int ...v){

        System.out.println(Arrays.toString(v));
    }

//    variable arguments for multiple types
    static void multiple(int a, int b, String ...v){

    }
}
