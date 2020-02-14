package DesignPatterns.Creational.Singleton;

public class LazySingleton {


    /* still not thread safe, but is created only it is requested so the start time of the application is not increased
            dut to creation of many singleton instances
     */

    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if(instance==null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
