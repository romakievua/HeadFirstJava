/**
 * Created by pm-01 on 27.09.2016.
 */
public class Array1 {
    public int[] swapEnds(int[] nums) {
        if (nums.length > 1) {
            nums[0] += nums[nums.length - 1];
            System.out.println("nums[0] = " + nums[0]);
            nums[nums.length - 1] = nums[0] - nums[nums.length - 1];
            System.out.println("nums[0] = " + nums[0]);
            nums[0] = nums[0] - nums[nums.length - 1];
            System.out.println("nums[0] = " + nums[0]);
        }
        return nums;
    }



    public static void main(String[] args) {
        Array1 array1 = new Array1();

        int[] a = {1};
        a = array1.swapEnds(a);
        String div = "";
        for (int i = 0; i < a.length; i++) {
            System.out.println(div+a[i]);
            div = ",";
        }
        System.out.println(array1.swapEnds(a));
        int[] b = {6, 1, 2, 3};
        System.out.println(array1.swapEnds(b));
        int[] c = {13, 6, 1, 2, 3};
        System.out.println(array1.swapEnds(c));
        //System.out.println( last2("xxxx") );
    }
}
