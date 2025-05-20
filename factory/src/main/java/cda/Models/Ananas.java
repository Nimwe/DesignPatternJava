package cda.Models;

import java.util.List;

public class Ananas extends Pizza {

    /**
     * Constructeur de la pizza Ananas
     * 
     * @param pate       Type de pâte choisi
     * @param baseTomate Base tomate ou crème
     * @param mozza      Avec mozza ou sans
     */
    public Ananas(String pate, boolean baseTomate, boolean mozza) {
        super(pate, baseTomate, mozza); // Appel du constructeur de Pizza
    }

    /**
     * Ajoute l'ingrédient spécifique à la Ananas : ananas.
     * 
     * @return Liste des étapes de préparation.
     */
    @Override
    public List<String> preparer() {
        List<String> etapes = super.preparer();
        etapes.add("Ingrédients : " + Ingredients.Ananas);
        return etapes;
    }

}
