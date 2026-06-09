public class Code {
    static void main() {
        int[] arr = new int[10];
        System.out.println(linearSearch(arr,78));
        arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(arr,4));


    }

//    return the index if element found else return -1
    static int linearSearch(int [] arr, int target){
        if(arr == null) return -1;
        else {
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == target){
                    return i;
                }
            }
            return -1;
        }
    }
}
