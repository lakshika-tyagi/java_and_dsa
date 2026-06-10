public class Main {
    static void main() {
        int [] arr = {12,30,45,61,75,82,95,100,110,450,895};
        System.out.println(binarySearch(arr,61));
        System.out.println(binarySearch(arr,82));
        System.out.println(binarySearch(arr,895));
        System.out.println(binarySearch(arr,1));
        System.out.println(binarySearch(arr,12));
        System.out.println(binarySearch(arr,16));

        int[] arr1 = {3,2,1,0};
        System.out.println(binarySearch(arr1,0));

    }

//    return the index
    static int binarySearch(int [] arr, int target){
        int low = 0;
        int high = arr.length -1 ;
        while(low <= high){
//            int mid = (low+high)/2;    if low+high has a large value it will exceed the range of integers and might give an error.
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
}
