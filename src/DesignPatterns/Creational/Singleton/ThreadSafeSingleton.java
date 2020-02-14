package DesignPatterns.Creational.Singleton;

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
        if(instance!=null) {
            throw new RuntimeException("use getInstance() method to create");
        }
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance==null) {
            synchronized (ThreadSafeSingleton.class){
                if (instance==null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
