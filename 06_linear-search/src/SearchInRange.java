public class SearchInRange {
    static void main() {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(linearSearch(arr, 3, 1, 4));
        System.out.println(linearSearch(arr, 1, 3, 9));
        System.out.println(linearSearch(arr, 0, 9, 9));
        System.out.println(linearSearch(arr, 6, 8, 7));
        System.out.println(linearSearch(arr, 0, 4, 8));


    }

    static int linearSearch(int[] arr, int i1, int i2, int target) {
        if (arr.length == 0) return -1;
        else if (i1 > i2 || i2 >= arr.length) return -1;
        else {
            for (int i = i1; i <= i2; i++) {
                if (arr[i] == target) return i;
            }
            return -1;
        }
    }
}
