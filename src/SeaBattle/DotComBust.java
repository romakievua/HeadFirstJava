package SeaBattle;
import java.util.*;
/**
 * Created by pm-01 on 26.09.2016.
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private  ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Vasha tsel - potopit tri saita.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Popytaites sdelat eto za min shagov");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Sdelaite hod");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Mimo";

        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Popal")) {
                break;
            }
            if (result.equals("Potopil")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Vse saity ushli ko dnu");
        if (numOfGuesses <= 18) {
            System.out.println("Eto zanyalo u Vas vsego " + numOfGuesses + " popytok.");
        } else {
            System.out.println("Eto zanyalo u Vas dovolno mnogo vremeni. " + numOfGuesses + " popytok.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
