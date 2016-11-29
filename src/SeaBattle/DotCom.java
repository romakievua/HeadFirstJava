package SeaBattle;
import java.util.*;
/**
 * Created by pm-01 on 26.09.2016.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "Mimo";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Potopil";
                System.out.println("Oy! Vy potopili " + name + " : ( ");
            } else {
                result = "Popal";
            }
        }
        return result;
    }
}
