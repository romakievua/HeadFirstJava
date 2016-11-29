package SeaBattle;

/**
 * Created by pm-01 on 22.09.2016.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHints = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Mimo";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Popal";
                numOfHints++;
                break;
            }
        }
        if (numOfHints == locationCells.length) {
            result = "Potopil";
        }
        System.out.println(result);
        return result;
    }
}
