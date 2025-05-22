package cda.models;

public class HelpObserver extends AlertObserver {

    @Override
    public void update(String data) {
        System.out.println("Alerte Secours " + data);
    }

    public String getNom() {
        return "Secours";
    }
}
