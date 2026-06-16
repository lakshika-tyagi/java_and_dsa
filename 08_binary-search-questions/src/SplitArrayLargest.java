public class SplitArrayLargest {
    static void main() {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));


    }

    static int splitArray(int [] nums, int m){
        int start = 0;
        int end = 0;

        for (int j : nums) {
            start = Math.max(start, j); //in the end of loop it will contain max. element
            end += j;  //sum of all values
        }

//        binary search
        while(start < end){
//            try for middle as potential ans
            int mid = start + (end - start)/2;

//            calculate how many pieces you can divide this in max. sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums){
                if(sum + num > mid){
//                    you cannot add this in current subarray, make new one
//                    you add this num in new subarray , sum = num
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }

            if(pieces <= m){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }

        return end; //start = end
    }

}
