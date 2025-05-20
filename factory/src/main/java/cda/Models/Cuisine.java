package cda.Models;

/**
 * Classe concrète représentant une cuisine où sont fabriquées les pizzas
 * 
 * Implémente la method fabriquerPizza du pattern Factory Method
 */
public class Cuisine extends Commande {

    /**
     * Fabrique une pizza selon le type fourni.
     * 
     * @param type       Type de pizza souhaité
     * @param pate       Pâte choisie
     * @param baseTomate Si base tomate ou crème
     * @param mozza      Si il y a de la mozzarella
     * @return Une instance de Pizza.
     * @throws IllegalArgumentException si le type de pizza n'est pas reconnu.
     */
    @Override
    protected Pizza fabriquerPizza(String Type, String pate, boolean baseTomate, boolean mozza) {
        return switch (Type.toLowerCase()) {
            case "margherita" -> new Margherita(pate, baseTomate, mozza);
            case "peperonni" -> new Peperonni(pate, baseTomate, mozza);
            case "végétarienne" -> new Vegetarienne(pate, baseTomate, mozza);
            case "ananas" -> new Ananas(pate, baseTomate, mozza);
            default -> throw new IllegalArgumentException("Nous ne faisons pas cette pizza ici : " + Type);
        };
    }

}
