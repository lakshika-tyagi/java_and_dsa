public class Code {
    static void main() {
        int[] arr = new int[10];
        System.out.println(linearSearch(arr, 78));
        
        arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(arr, 4));

        System.out.println(linearSearch2(arr, 78));
        System.out.println(linearSearch2(arr, 4));

        System.out.println(linearSearch3(arr, 78));
        System.out.println(linearSearch3(arr, 4));


    }

    //    search element and return index
//    return the index if element found else return -1
    static int linearSearch(int[] arr, int target) {
        if (arr == null) return -1;
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }

    //    search element and return element
    static int linearSearch2(int[] arr, int target) {
        if (arr == null) return -1;
        else {
            for (int i : arr) {
                if (i == target) {
                    return i;
                }
            }
            return Integer.MAX_VALUE;
        }
    }

    //    search element and return true/false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr == null) return false;
        else {
            for (int i : arr) {
                if (i == target) {
                    return true;
                }
            }
            return false;
        }
    }

}
