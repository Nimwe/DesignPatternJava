package cda.models;

import java.util.ArrayList;
import java.util.List;

public class TemperaturesSensor implements Sensor {

    private List<AlertObserver> observers = new ArrayList<>();

    @Override
    public void addSubscriber(AlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubscriber(AlertObserver observer) {
        observers.remove(observer);
        System.out.println("Désactivation de l'alerte du capteur de température via " + observer.getNom());
    }

    @Override
    public void updateSubscriber(String data) {
        for (AlertObserver observer : observers) {
            observer.update(data);
        }
    }

    @Override
    public void simulateDetectionEven() {
        System.out.println("Modification de la température => ");
        updateSubscriber("=> Envoi de la notification : Modification de la température");
    }

    @Override
    public String getNom() {
       return "Capteur de temperatures";
    }

}
