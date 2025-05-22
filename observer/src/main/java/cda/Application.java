package cda;

import cda.models.AlarmObserver;
import cda.models.AlertObserver;
import cda.models.AzoteSensor;
import cda.models.HelpObserver;
import cda.models.MailObserver;
import cda.models.Sensor;
import cda.models.SmartphoneObserver;
import cda.models.SmokeSensor;
import cda.models.TemperaturesSensor;

public class Application {

    public static void main(String[] args) {

        Sensor smokeSensor = new SmokeSensor();
        Sensor temperatureSensor = new TemperaturesSensor();
        Sensor azoteSensor = new AzoteSensor();

        AlertObserver mail = new MailObserver();
        AlertObserver smartphone = new SmartphoneObserver();
        AlertObserver alarmObserver = new AlarmObserver();
        AlertObserver helpObserver = new HelpObserver();

        // Abonnements

        // Capteur de fumées
        smokeSensor.addSubscriber(mail);
        smokeSensor.addSubscriber(smartphone);
        smokeSensor.addSubscriber(alarmObserver);
        smokeSensor.addSubscriber(helpObserver);

        // Capteur de température
        temperatureSensor.addSubscriber(mail);
        temperatureSensor.addSubscriber(smartphone);

        // Capteur d'Azote
        azoteSensor.addSubscriber(alarmObserver);
        azoteSensor.addSubscriber(helpObserver);

        // Désabonnements
        System.out.println("Désabonnements alertes : ");
        smokeSensor.removeSubscriber(mail);
        smokeSensor.removeSubscriber(smartphone);

        temperatureSensor.removeSubscriber(alarmObserver);
        azoteSensor.removeSubscriber(helpObserver);

        // Simulation d'événements
        System.out.println("\n");
        smokeSensor.simulateDetectionEven();
        System.out.println("\n");
        temperatureSensor.simulateDetectionEven();
        System.out.println("\n");
        azoteSensor.simulateDetectionEven();

    }
}
