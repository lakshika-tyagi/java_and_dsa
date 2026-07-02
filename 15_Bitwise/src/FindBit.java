public class FindBit {
    static void main() {
        System.out.println(findBit(10,2));
        System.out.println(findBit(17,0));
        System.out.println(findBit(17,1));
    }

    static int findBit(int n, int i){
        return (n >> i) & 1;
//        return n & (1 << (i-1));  //this is wrong it will give a power of 2
    }
}
