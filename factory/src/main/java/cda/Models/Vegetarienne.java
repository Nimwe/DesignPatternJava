package cda.Models;

import java.util.List;

public class Vegetarienne extends Pizza {

    /**
     * Constructeur de la pizza Végétarienne
     * 
     * @param pate       Type de pâte choisi
     * @param baseTomate Base tomate ou crème
     * @param mozza      Avec mozza ou sans
     */
    public Vegetarienne(String pate, boolean baseTomate, boolean mozza) {
        super(pate, baseTomate, mozza); // Appel du constructeur de Pizza
    }

    /**
     * Ajoute l'ingrédient spécifique à la Végétarienne : légumes.
     * 
     * @return Liste des étapes de préparation.
     */
    @Override
    public List<String> preparer() {
        List<String> etapes = super.preparer();
        etapes.add("Ingredients : " + Ingredients.Legumes);
        return etapes;
    }
}
