public class Performance {
    static void main() {
        String series = "";
        for(int i = 0; i < 26; i++ ){
            char ch= (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);

//        this will lead to time complexity of O(n^2)
//        a new object is created after every iteration and then garbage collected this will lead to so much memory wastage
    }
}
