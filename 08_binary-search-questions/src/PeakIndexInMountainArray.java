public class PeakIndexInMountainArray {

//    https://leetcode.com/problems/peak-index-in-a-mountain-array/

    static void main() {

        int [] arr = {0,1,2,4,10,12,19,3,1};
        int[] arr1 = {3,4,5,1};
        int [] arr2 = {0,1,2,10,9,8,7,2,1,0};
        int[] arr3 = {18,29,38,59,98,100,99,98,90};

        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(peakIndexInMountainArray(arr1));
        System.out.println(peakIndexInMountainArray(arr2));
        System.out.println(peakIndexInMountainArray(arr3));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length -1;
        int mid;
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr[mid] < arr[mid+1])low = mid+1;
            else high = mid-1;
        }
        return low;
    }
}
