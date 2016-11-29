/**
 * Created by pm-01 on 29.09.2016.
 */
public class Logic2 {
    public boolean makeBricks(int small, int big, int goal) {
        //System.out.println((goal == 5*big) + " " + (goal <= small)  + " " +  (goal < 5*big && goal % 5 <= small)  + " " +  (goal > 5*big && goal <= 5*big + small) + " ");
        return (goal == 5*big) || (goal <= small) || (goal < 5*big && goal % 5 <= small) || (goal > 5*big && goal <= 5*big + small);
    }

    public static void main(String[] args) {
        Logic2 logic2 = new Logic2();
/*
System.out.println( logic2.makeBricks(3, 1, 8) );
System.out.println( logic2.makeBricks(3, 1, 9) );
System.out.println( logic2.makeBricks(3, 2, 10) );
*/
        System.out.println( logic2.makeBricks(3, 1, 8) == true );
        System.out.println( logic2.makeBricks(3, 1, 9) == false );
        System.out.println( logic2.makeBricks(3, 2, 10) == true );
        System.out.println( logic2.makeBricks(3, 2, 8) == true );
        System.out.println( logic2.makeBricks(3, 2, 9) == false );
        System.out.println( logic2.makeBricks(6, 1, 11) == true );
        System.out.println( logic2.makeBricks(6, 0, 11) == false );
        System.out.println( logic2.makeBricks(1, 4, 11) == true );
        System.out.println( logic2.makeBricks(0, 3, 10) == true );
        System.out.println( logic2.makeBricks(1, 4, 12) == false );
        System.out.println( logic2.makeBricks(3, 1, 7) == true );
        System.out.println( logic2.makeBricks(1, 1, 7) == false );
        System.out.println( logic2.makeBricks(2, 1, 7) == true );
        System.out.println( logic2.makeBricks(7, 1, 11) == true );
        System.out.println( logic2.makeBricks(7, 1, 8) == true );
        System.out.println( logic2.makeBricks(7, 1, 13) == false );
        System.out.println( logic2.makeBricks(43, 1, 46) == true );
        System.out.println( logic2.makeBricks(40, 1, 46) == false );
        System.out.println( logic2.makeBricks(40, 2, 47) == true );
        System.out.println( logic2.makeBricks(40, 2, 50) == true );
        System.out.println( logic2.makeBricks(40, 2, 52) == false );
        System.out.println( logic2.makeBricks(22, 2, 33) == false );
        System.out.println( logic2.makeBricks(0, 2, 10) == true );
        System.out.println( logic2.makeBricks(1000000, 1000, 1000100) == true );
        System.out.println( logic2.makeBricks(2, 1000000, 100003) == false );
        System.out.println( logic2.makeBricks(20, 0, 19) == true );
        System.out.println( logic2.makeBricks(20, 0, 21) == false );
        System.out.println( logic2.makeBricks(20, 4, 51) == false );
        System.out.println( logic2.makeBricks(20, 4, 39) == true );

    }
}
