package cda.models;

public class AlarmObserver extends AlertObserver {

    public void update(String data) {
        System.out.println(data);
    }

    public String getNom() {
        return "Alarme";
    }
    
}
