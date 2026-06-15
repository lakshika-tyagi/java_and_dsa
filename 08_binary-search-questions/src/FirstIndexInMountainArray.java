public class FirstIndexInMountainArray {
    static void main() {

        int [] arr = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(arr,3));

        int [] arr2 = {1,5,2};
        System.out.println(findInMountainArray(arr2,5));

        int [] arr3 = {0,1,2,4,2,1};
        System.out.println(findInMountainArray(arr3,3));

    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1] )start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }

    static int binarySearch(int [] arr, int target , int start , int end){
        boolean inc = true;
        if(arr[start] > arr[end])inc = false;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)return mid;
            else if(inc){
                if(arr[mid] > target)end = mid - 1;
                else start = mid + 1;
            }
            else{
                if(arr[mid] > target)start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }

    static int findInMountainArray(int [] arr, int target) {
        int start = 0;
        int mid = findPeak(arr);
        int end = arr.length - 1;
        int ans = binarySearch(arr,target,start,mid);
        if(ans == -1) ans = binarySearch(arr,target,mid,end);
        return ans;

    }
}
