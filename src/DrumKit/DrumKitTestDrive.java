package DrumKit;

/**
 * Created by pm-01 on 19.09.2016.
 */
public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        if (d.snare == true) {
            d.playSnare();
        }
        d.snare = false;
        d.playToHat();
    }
}
