package cda.Models;

/**
 * Représente un lecteur audio.
 */
public class AudioPlayer {

    /**
     * Charge une piste audio à jouer.
     *
     * @param track Le nom de la piste.
     */
    public void load(String track) {
        System.out.println("Loading track : " + track);
    }

    /**
     * Joue la piste audio.
     */
    public void play() {
        System.out.println("Playing audio");
    }
}
