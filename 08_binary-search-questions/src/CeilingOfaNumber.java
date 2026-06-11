public class CeilingOfaNumber {
    static void main() {
        int [] arr = {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,0));
        System.out.println(ceiling(arr,2));
        System.out.println(ceiling(arr,3));
        System.out.println(ceiling(arr,4));
        System.out.println(ceiling(arr,5));
        System.out.println(ceiling(arr,6));
        System.out.println(ceiling(arr,13));
        System.out.println(ceiling(arr,15));
        System.out.println(ceiling(arr,17));
        System.out.println(ceiling(arr,20));

    }

    static int ceiling(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        if(target > arr[high])return -1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr[mid] == target)return arr[mid];
            else if(arr[mid] < target)low = mid + 1;
            else high = mid - 1;
        }
        return arr[low];
    }
}
