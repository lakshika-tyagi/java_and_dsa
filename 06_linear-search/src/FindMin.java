public class FindMin {
    static void main() {
        int[] arr = {-2, -1, 23, 43, 54, 34, 54, -20, 1000};
        System.out.println(min(arr));

    }

    static int min(int[] arr) {
        if (arr.length == 0) return Integer.MIN_VALUE;
        else {
            int min = arr[0];
            for (int i : arr) {
                if (min > i) min = i;
            }
            return min;
        }
    }
}
