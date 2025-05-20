package cda.Models;

import java.util.List;

public class Peperonni extends Pizza {

    /**
     * Constructeur de la pizza Peperonni
     * 
     * @param pate       Type de pâte choisi
     * @param baseTomate Base tomate ou crème
     * @param mozza      Avec mozza ou sans
     */
    public Peperonni(String pate, boolean baseTomate, boolean mozza) {
        super(pate, baseTomate, mozza); // Appel du constructeur de Pizza
    }

    /**
     * Ajoute l'ingrédient spécifique à la Peperonni : peperonni.
     * 
     * @return Liste des étapes de préparation.
     */
    @Override
    public List<String> preparer() {
        List<String> etapes = super.preparer();
        etapes.add("Ingrédients : " + Ingredients.Peperonni);
        return etapes;
    }

}
