public class OrderAgnosticBinarySearch {
    static void main() {

        int [] arr = {12,30,45,61,75,82,95,100,110,450,895};
        System.out.println(binarySearch(arr,61));
        System.out.println(binarySearch(arr,895));
        System.out.println(binarySearch(arr,12));
        System.out.println(binarySearch(arr,16));

        int[] arr1 = {3,2,1,0,-23,-100,-200};
        System.out.println(binarySearch(arr1,0));
        System.out.println(binarySearch(arr1,10));
        System.out.println(binarySearch(arr1,-200));

    }
    static int binarySearch(int [] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int res;
        if(arr[s] < arr[e]) res = binary_increase(arr,target);
        else res = binary_decrease(arr,target);
        return res;
    }

    static int binary_increase(int[] arr, int target){
        int low = 0;
        int high = arr.length -1 ;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    static int binary_decrease(int [] arr, int target){
        int low = 0;
        int high = arr.length -1 ;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
