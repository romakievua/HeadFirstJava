/**
 * Created by pm-01 on 12.10.2016.
 */
public class Array {
    public int countClumps(int[] nums) {
        int res = 0;
        int count = 0;
        int elem;
        if (nums.length > 0) {
            elem = nums[0];
            count = 1;
            for (int i = 1; i < nums.length; i++) {
                if (elem != nums[i]) {
                    elem = nums[i];
                    if (count >= 2)
                        res++;
                    count = 1;
                } else {
                    count++;
                }
            }
            if (count >= 2)
                res++;
        }
        else
            return 0;
        return res;
    }

    public int maxMirror1(int[] nums) {
        Array array = new Array();
        array.arrToConsole(nums);
        int res = 0;
        int count = 0;
        int[] mirr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            mirr[i] = nums[nums.length-1-i];
        }

        array.arrToConsole(mirr);

        int i = 0, j = 0;
        boolean flag = false;
        while (i < nums.length) {
            if (j >= mirr.length) {
                j = 0;
                i++;
            }
            while (j < mirr.length && i < nums.length && nums[i] == mirr[j]) {
                System.out.print(nums[i] + " == " + mirr[j] + "; i = " + i + "; j = " + j);
                count++;
                System.out.println("; count = " + count);
                i++;
                j++;
                flag = true;
            }
            if (count > res)
                res = count;
            count = 0;
            if (flag) {
                j = 0;
                flag = false;
            }
            else {
                j++;
            }
        }

        return res;
    }

    public int numberOfElem(int[] nums, int elem) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == elem)
                res++;
        }
        return res;
    }

    public int maxElem(int[] nums) {
        int maxElem = 0;
        if (nums.length > 0)
            maxElem = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxElem)
                maxElem = nums[i];
        }
        return maxElem;
    }

    public int minElem(int[] nums) {
        int minElem = 0;
        if (nums.length > 0)
            minElem = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minElem)
                minElem = nums[i];
        }
        return minElem;
    }

    public int sumElem(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public void arrToConsole(int[] myArray) {
        String div = "";
        for (int v : myArray) {
            System.out.print(div + v);
            div = ", ";
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array array = new Array();

        int[] a = {};
        int[] b = {};
        System.out.println( array.countClumps(a) );
        //array.arrToConsole( array.maxMirror(3) );
/*
        int[] a1 = {4, 2, 2, 3};
        System.out.println( array.twoTwo(a1) == true );
        int[] a2 = {2, 2, 4};
        System.out.println( array.twoTwo(a2) == true );
        int[] a3 = {2, 2, 4, 2};
        System.out.println( array.twoTwo(a3) == false );
        int[] a4 = {1, 3, 4};
        System.out.println( array.twoTwo(a4) == true );
        int[] a5 = {1, 2, 2, 3, 4};
        System.out.println( array.twoTwo(a5) == true );
        int[] a6 = {1, 2, 3, 4};
        System.out.println( array.twoTwo(a6) == false );
        int[] a7 = {2, 2};
        System.out.println( array.twoTwo(a7) == true );
        int[] a8 = {2, 2, 7};
        System.out.println( array.twoTwo(a8) == true );
        int[] a9 = {2, 2, 7, 2, 1};
        System.out.println( array.twoTwo(a9) == false );
        int[] a10 = {4, 2, 2, 2};
        System.out.println( array.twoTwo(a10) == true );
        int[] a11 = {2, 2, 2};
        System.out.println( array.twoTwo(a11) == true );
        int[] a12 = {1, 2};
        System.out.println( array.twoTwo(a12) == false );
        int[] a13 = {2};
        System.out.println( array.twoTwo(a13) == false );
        int[] a14 = {1};
        System.out.println( array.twoTwo(a14) == true );
        int[] a15 = {};
        System.out.println( array.twoTwo(a15) == true );
        int[] a16 = {5, 2, 2, 3};
        System.out.println( array.twoTwo(a16) == true );
        int[] a17 = {2, 2, 5, 2};
        System.out.println( array.twoTwo(a17) == false );
*/
    }
}
