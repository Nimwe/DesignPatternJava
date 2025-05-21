package cda;

import cda.Models.Amplifier;
import cda.Models.Speaker;
import cda.Models.AudioPlayer;
import cda.Models.JukeboxFacade;

/**
 * Classe de test principale pour le système Jukebox utilisant le pattern
 * Facade.
 * 
 * Créarion des composants du sous-système audio (amplificateur, haut-parleur,
 * lecteur audio), injection dans la façade JukeboxFacade et lancement de
 * la lecture de musique via une interface simplifiée.
 * 
 */
public class Application {

    /**
     * Point d'entrée de l'application.
     * 
     * Initialise les composants du système audio et utilise la façade
     * JukeboxFacade pour lancer la lecture de musique.
     *
     */
    public static void main(String[] args) {

        // Création des composants
        Amplifier amplifier = new Amplifier();
        Speaker speaker = new Speaker();
        AudioPlayer audioPlayer = new AudioPlayer();

        // Création de la façade
        JukeboxFacade jukebox = new JukeboxFacade(amplifier, speaker, audioPlayer);

        // Utilisation de la façade
        jukebox.playMusic();
    }
}
