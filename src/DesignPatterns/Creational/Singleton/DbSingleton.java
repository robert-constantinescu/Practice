package DesignPatterns.Creational.Singleton;

public class DbSingleton {


    //static Singleton does not guarantees Thread Safety
    private static DbSingleton instance = new DbSingleton();

    private DbSingleton() {

    }

    public static DbSingleton getInstance() {
        return instance;
    }

}
