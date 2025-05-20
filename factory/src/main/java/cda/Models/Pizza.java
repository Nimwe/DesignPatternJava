package cda.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstraite représentant une pizza
 * 
 * Chaque pizza possède une pâte, une base (tomate ou creème) et de la
 * mozzarella (ou non),
 * et peut définir ses propres étapes de préparation.
 */
public abstract class Pizza {

    protected String pate;
    protected boolean baseTomate;
    protected boolean mozza;

    /**
     * Constructeur d'une pizza
     * 
     * @param pate       Type de pâte
     * @param baseTomate Base tomate ou crème
     * @param mozza      Avec ou sans Mozza
     */
    public Pizza(String pate, boolean baseTomate, boolean mozza) {
        this.pate = pate;
        this.baseTomate = baseTomate;
        this.mozza = mozza;
    }

    /**
     * Renvoie aux étapes de préparation de la pizza
     * Peut être redefini par les sous-class pour y ajouter ou modifier des etapes
     * 
     * @return La liste des étapes de préparation
     */
    public List<String> preparer() {
        List<String> etapes = new ArrayList<>();
        etapes.add("Pâte : " + pate);
        etapes.add("Base tomate : " + baseTomate);
        etapes.add("Mozza : " + mozza);
        return etapes;
    }
}
