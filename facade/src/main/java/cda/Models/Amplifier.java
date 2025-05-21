package cda.Models;

/**
 * Représente un amplificateur audio.
 */
public class Amplifier {

    /**
     * Allume l'amplificateur.
     */
    public void turnOn() {
        System.out.println("Amplifier on");
    }

    /**
     * Définit le volume de l'amplificateur.
     *
     * @param level Niveau de volume souhaité.
     */
    public void setVolume(int level) {
        System.out.println("Setting volume to : " + level);
    }
}
