/**
 * Created by pm-01 on 20.09.2016.
 */
public class Warmup1 {
    public static boolean has271(int[] nums) {
        if (nums.length > 2)
            for (int i = 0; i < nums.length-2; i++) {
                if ( nums[i] == nums[i+1]-5 && Math.abs(nums[i] - 1 - nums[i+2]) <= 2 )
                    return true;
            }
        return false;
    }


    public static void main(String[] args) {
        int[] a = {2, 7, 3};
        System.out.println( has271(a) );
        int[] b = {4, 5, 3, 8, 0};
        System.out.println( has271(b) );
        int[] c = {2, 7, -1};
        System.out.println( has271(c) );
        //System.out.println( last2("xxxx") );
    }
}
