package cda;

import java.util.Objects;

public class Application {

    public static void main(String[] args) {
        PasswordVault password1 = PasswordVault.getinstance();
        PasswordVault password2 = PasswordVault.getinstance();

        // Ajout des passwords
        password1.addPassword("Facebook", "Blablabla");
        password2.addPassword("Mail", "Blupblupblup");

        // Récupération des passwords
        System.out.println("Facebook password is : " + password1.getPassword("Facebook"));
        System.out.println("Mail password is : " + password2.getPassword("Mail"));

        // Vérification de l'instance de password1 et password2
        System.out.println("Password 1 == password 2 ? " + (password1 == password2)); // => true
        System.out.println("Password 1 Facebook : " + password1.getPassword("Facebook") + " - Instance : "
                + Objects.toIdentityString(password1));
        System.out.println("Password 2 Mail : " + password1.getPassword("Facebook") + " - Instance : "
                + Objects.toIdentityString(password2)); // Doit afficher la même chose pour l'instance

    }
}
