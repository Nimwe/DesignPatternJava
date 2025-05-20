package cda.Models;

/**
 * Classe abstraite pour les commandes de Pizzas
 * 
 * Implemetation du pattern Factory Method => Délégue la création des objets
 * Pizza à des sous-classe via la methode abstraite fabriquerPizza
 */
public abstract class Commande {

    /**
     * Méthode pour commander une pizza
     * 
     * @param type       Type de pizza souhaitée
     * @param pate       Type de pate souhaitée
     * @param baseTomate Base souhaitée
     * @param Mozza      Ave Mozza
     * @return une instance Pizza avec les paramètres demandés par le client
     */
    public Pizza commanderPizza(String type, String pate, boolean baseTomate, boolean Mozza) {
        return fabriquerPizza(type, pate, baseTomate, Mozza);
    }

    /**
     * Factory Method à implementer dans les sous-class pour fabirquer la pizza
     * 
     * @param type
     * @param pate
     * @param baseTomate
     * @param Mozza
     * @return
     */
    protected abstract Pizza fabriquerPizza(String type, String pate, boolean baseTomate, boolean Mozza);

}
