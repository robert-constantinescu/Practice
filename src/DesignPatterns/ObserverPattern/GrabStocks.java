package DesignPatterns.ObserverPattern;

public class GrabStocks {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPirce(200.00);
        stockGrabber.setGoogPrice(203.00);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.unregister(observer1);

        stockGrabber.setIbmPrice(297.00);
        stockGrabber.setAaplPirce(300.00);
        stockGrabber.setGoogPrice(303.00);




    }
}
