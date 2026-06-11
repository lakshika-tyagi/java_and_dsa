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
            int s = mid-1, e = mid+1;
            if(e >= arr.length) e = arr.length - 1;
            if(s <= -1) s = 0;
            if(arr[mid] >= arr[e] && arr[mid] >= arr[s])return mid;
            else if(arr[mid] >= arr[e])high = s;
            else if(arr[mid] >= arr[s])low = e;
        }
        return -1;
    }
}
