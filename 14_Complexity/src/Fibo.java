public class Fibo {

    static void main() {

        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
        }
        System.out.println(fiboFormula(50));
        System.out.println(fiboFormula(10));

    }

//    time complexity is O(Math.pow(((1 + Math.sqrt(5) )/2 ), n)) =  O(1.680^n);

    static int fiboFormula(int n){
//        return (int)( ((1/Math.sqrt(5))*Math.pow(((1 + Math.sqrt(5) )/2 ), n)) - ((1/Math.sqrt(5))*Math.pow(((1 - Math.sqrt(5) )/2 ), n)) );  //fibo(2) = 0 which is wrong
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }


//    space complexity : O(n) ; height of tree ,or we can say the longest chain from root to leaf
//    time complexity : O(2^n)


    static int fibo(int n){
        if(n < 2)return n;
        return fibo(n-1) + fibo(n-2);
    }
}