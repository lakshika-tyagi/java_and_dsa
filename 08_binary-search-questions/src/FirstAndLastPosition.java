import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/2031497756/

public class FirstAndLastPosition {
    static void main() {

        int [] arr = {5,7,7,8,8,10};

        System.out.println(Arrays.toString(searchRange(arr,8)));
        System.out.println(Arrays.toString(searchRange(arr,6)));
        System.out.println(Arrays.toString(searchRange(arr,5)));
    }


//    this function return the index value of target
    static int binarySearch(int [] arr, int target , boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] ==target){
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if (arr[mid] > target)end = mid - 1;
            else start = mid + 1;
        }
        return ans;
    }

    static int[] searchRange(int [] arr, int target){
        int[] ans = {-1,-1};

//        check for first
       ans[0] = binarySearch(arr,target,true);
       ans[1] = binarySearch(arr,target,false);

       return ans;

    }
}
