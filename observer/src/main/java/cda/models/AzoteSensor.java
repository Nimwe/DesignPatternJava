package cda.models;

import java.util.ArrayList;
import java.util.List;

public class AzoteSensor implements Sensor {
    private List<AlertObserver> observers = new ArrayList<>();

    @Override
    public void addSubscriber(AlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubscriber(AlertObserver observer) {
        observers.remove(observer);
        System.out.println("Désactivation de l'alerte du capteur d'Azote via " + observer.getNom());
    }

    @Override
    public void updateSubscriber(String data) {
        for (AlertObserver observer : observers) {
            observer.update(data);
        }
    }

    @Override
    public void simulateDetectionEven() {
        System.out.println("Modification du niveau d'Azote =>");
        updateSubscriber("=> Envoi de la notification : Modification du niveau d'Azote");
    }

    @Override
    public String getNom() {
       return "Capteur d'Azote";
    }

}
