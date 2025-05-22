package cda.models;

public class SmartphoneObserver extends AlertObserver {

    @Override
    public void update(String data) {
        System.out.println("Alerte Smarphone " + data);
    }

    public String getNom() {
        return "Smartphone";
    }

}
