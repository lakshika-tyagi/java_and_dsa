public class Scope {
    static void main() {
        int a = 10;
        int b = 20;
        
//        block scope
        {
            a = 89;  //only change the value can't initialize it.
            int c = 99;
//            value initialized in block will remain in block, can't be used outside block
        }
        System.out.println(a);
        int c = 90;
        
//        loop scope
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            a = 100;
//            int c = 90;
        }
        System.out.println(a);
    }
    static void random (int marks){
        int num = 76;
        System.out.println(num);
        System.out.println(marks) ;
    }
}
