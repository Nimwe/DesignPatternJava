package cda;

import java.util.List;
import java.util.Scanner;

import cda.Models.Commande;
import cda.Models.Pizza;
import cda.Models.Cuisine;

/**
 * Class principale pour lancer l'apps
 * Utilise un scanner pour interagir avec un client
 * 
 */
public class Application {

    /**
     * Point d'entrée de l'application.
     * 
     * @param args non utilisé.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Commande commande = new Cuisine();

        System.out.println(
                "Bienvenue à la pizzeria, veuillez choisir votre pizza svp (Margherita, Peperonni, Ananas, Végétarienne ?)");
        String typePizza = scanner.nextLine().toLowerCase();
        System.out.println("Quel type de pâte souhaitez-vous Fine, Classic, Fromage) ?");
        String pate = scanner.nextLine();
        System.out.println("Souhaitez-vous une base tomate ? (oui /non) : ");
        boolean baseTomate = scanner.nextLine().equalsIgnoreCase("oui");
        System.out.println("De la Mozza ? (oui/non)");
        boolean mozza = scanner.nextLine().equalsIgnoreCase("oui");

        Pizza pizza = commande.commanderPizza(typePizza, pate, baseTomate, mozza);

        afficherPreparation(typePizza, pizza);

        scanner.close();
    }

    /**
     * Affiche les étapes de préparation d'une pizza.
     * 
     * @param nom   Nom de la pizza.
     * @param pizza L'objet Pizza préparé.
     */
    private static void afficherPreparation(String nom, Pizza pizza) {

        System.out.println("\n Préparation de la pizza " + nom + " : ");

        List<String> etapes = pizza.preparer();
        for (String etape : etapes) {
            System.out.println(" - " + etape);
        }
        System.out.println("Votre pizza est prête! Bon appetit!");

    }

}
