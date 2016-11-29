package SeaBattle;

/**
 * Created by pm-01 on 22.09.2016.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);


        String userGuess = "5";
        String result = dot.checkYourself(userGuess);
        /*
        String testResult = "Fault";
        if (result.equals("Success")) {
            testResult = "Pass";
        }
        System.out.println(testResult);
        */
    }
}
