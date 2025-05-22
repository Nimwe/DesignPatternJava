package cda.models;

public class MailObserver extends AlertObserver {
    
    @Override
    public void update(String data) {
        System.out.println("Alerte Mail " + data);
    }

    public String getNom() {
        return "Mail";
    }

}
