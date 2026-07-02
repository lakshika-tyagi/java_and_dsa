public class ResetBit {
    static void main() {

        System.out.println(resetBit(10,2));
        System.out.println(resetBit(86,5));  // 86 = 1010110 ; 70 = 1000110

        System.out.println(resetBit(5,2));

    }

    static int resetBit(int n, int i){
        return n & ~(1 << (i-1));
    }
}
