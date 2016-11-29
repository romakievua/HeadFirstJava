package BeatBox;
import javax.sound.midi.*;
/**
 * Created by pm-01 on 06.10.2016.
 */
public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Мы получили синтезатор");
        } catch (MidiUnavailableException ex) {
            System.out.println("Неудача");
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
