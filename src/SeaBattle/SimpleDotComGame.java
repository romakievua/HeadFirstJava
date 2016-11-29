package SeaBattle;

/**
 * Created by pm-01 on 22.09.2016.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Vvedite chislo");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Potopil")) {
                isAlive = false;
                System.out.println("Vam potrebovalos " + numOfGuesses + " popytok(i)");
            }
        }
    }
}
