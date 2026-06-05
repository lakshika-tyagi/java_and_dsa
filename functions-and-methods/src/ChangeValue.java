import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    static void main() {
//        create an array
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change (int [] nums){
        nums[0] = 99;
    }
}
