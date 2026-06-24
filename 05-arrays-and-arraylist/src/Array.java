import java.util.Arrays;

public class Array{
    static void main() {
//        syntax of array
//        datatype[] variable_name = new datatype[size]

//        store 5 roll no
        int[] rno1 = new int[5];
        double[] rno2 = {1,2,3.8,4,5};

        System.out.println(rno2[3]);
        rno2[3] = 90;
        System.out.println(rno2[3]);

        int[] ros; //declaration of array.ros is getting defined in the stack.
//        System.out.println(ros);  //error: variable ros might not have been initialized
        ros = new int[5]; //initialization; actually here object is being created in the memory(heap)
        System.out.println(ros[4]);

        String[] arr = new String[4];
        System.out.println(arr[2]);

//        memory reference variable
        int[] a = {10,20,30};
        int [] b = a;
        b[0] = 99;
        System.out.println(Arrays.toString(a));   //despite of changing only b, a is also changed because a and b both points to same variable
    }
}
