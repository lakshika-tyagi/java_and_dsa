import java.util.Arrays;

public class SortedMatrix {
    static void main() {

        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {12, 13, 14, 15, 16},
                {20, 21, 22, 23, 24, 25}
        };
        System.out.println(Arrays.toString(searchMatrix(arr, 22)));

    }

    static int[] searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        int ans = -1;
        int c = matrix[0].length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid][0] <= target && matrix[mid][c] >= target) {
                ans = binarySearch(matrix[mid], target);
                return new int[]{mid, ans};
            } else if (matrix[mid][0] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

}
