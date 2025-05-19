package cda;

import java.util.HashMap;

public final class PasswordVault { // final class => Singleton
    private static PasswordVault instance; // instance = nom de variable / passwordVault = nom singleton
    public HashMap<String, String> passwords;

    // Constructeur privé
    private PasswordVault() { // Constructeur privé donc personne ne peut l'instancier aileurs
        this.passwords = new HashMap<>();

    }

    // Methode publique pour récupérer l'instance
    public static PasswordVault getinstance() {
        if (instance == null) {
            instance = new PasswordVault();
        }
        return instance;
    }

    // Ajouter un password
    public void addPassword(String service, String password) {
        passwords.put(service, password);
    }

    // Récuperer un password
    public String getPassword(String service) {
        return passwords.get(service);
    }

    // Toutes les methodes, telles que le Crud etc, sont à faire ici
    // pour la manipulation des password. Pas dans App

}
