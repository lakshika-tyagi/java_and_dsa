import java.util.Arrays;

public class SearchIn2DArray {
    static void main() {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9, 10, 99, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };

        System.out.println(Arrays.toString(linearSearch(arr, 3)));
        System.out.println(Arrays.toString(linearSearch(arr, 11)));
        System.out.println(Arrays.toString(linearSearch(arr, 17)));
        System.out.println(Arrays.toString(linearSearch(arr, 89)));

        System.out.println(max(arr));

    }

    static int[] linearSearch(int[][] arr, int target) {
        if (arr.length == 0) return new int[]{-1, -1};
        else {
//            int [] ans = new int[2];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{-1, -1};
        }
    }

    static int max(int[][] arr) {
        if (arr.length == 0) return Integer.MAX_VALUE;
        else {
            int max = arr[0][0];
            for (int[] i : arr) {
                for (int j : i) {
                    if (max < j) {
                        max = j;
                    }
                }
            }
            return max;
        }
    }
}
