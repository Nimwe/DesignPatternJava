package cda.Models;

/**
 * La classe JukeboxFacade est une interface simplifiée pour contrôler
 * un jukebox complet composé d'un amplificateur, de haut-parleurs et d'un
 * lecteur audio.
 *
 * On utilise le patron de conception Facade pour masquer la complexité
 * du sous-système audio.
 */
public class JukeboxFacade {

    private Amplifier amplifier;
    private Speaker speaker;
    private AudioPlayer audioPlayer;

    // Constructor
    /**
     * Constructor de JukeboxFacade
     *
     * @param amplifier   L'amplificateur audio.
     * @param speaker     Les haut-parleurs.
     * @param audioPlayer Le lecteur audio.
     */
    public JukeboxFacade(Amplifier amplifier, Speaker speaker, AudioPlayer audioPlayer) {
        this.amplifier = amplifier;
        this.speaker = speaker;
        this.audioPlayer = audioPlayer;
    }

    /**
     * Lance la lecture de la musique en initialisant tous les composants audio.
     */
    public void playMusic() {
        amplifier.turnOn();
        amplifier.setVolume(5);
        speaker.connect();
        audioPlayer.load("Violin");
        audioPlayer.play();
        speaker.outputSound();

    }

}
