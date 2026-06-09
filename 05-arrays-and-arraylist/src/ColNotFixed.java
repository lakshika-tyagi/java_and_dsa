public class ColNotFixed {
    static void main() {
        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for(int[] value : arr){
            for(int i : value){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
