package cda.models;

public interface Sensor {

    void addSubscriber(AlertObserver observer);

    void removeSubscriber(AlertObserver observer);

    String getNom();

    void updateSubscriber(String data);

    void simulateDetectionEven();

}
