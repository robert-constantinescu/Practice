package DesignPatterns.ObserverPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPirce;
    private double googPrice;

    public StockGrabber() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);

    }

    @Override
    public void unregister(Observer deleteObserver) {

        int observerIndex =observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex +1) + " deleted");

        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {

        for (Observer observer: observers) {
            observer.update(ibmPrice, aaplPirce, googPrice);
        }
    }


    public double getIbmPrice() {
        return ibmPrice;
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public double getAaplPirce() {
        return aaplPirce;
    }

    public void setAaplPirce(double aaplPirce) {
        this.aaplPirce = aaplPirce;
        notifyObserver();
    }

    public double getGoogPrice() {
        return googPrice;
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
