public class SetBit {
    static void main() {

        System.out.println(setBit(10,1));
        System.out.println(setBit(4,3));

        System.out.println(setBit(1437,7)); //1437 = 10110011101  , 10111011101 = 1501
    }

    static int setBit(int n,int i){
        return n | (1 << (i-1));
    }
}
