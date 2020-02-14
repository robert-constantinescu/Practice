package DesignPatternsMyImplementation.Singleton;

public class Singleton {


    private static volatile Singleton uniquesInstance;

    private Singleton() {

    }


    public static Singleton getUniquesInstance() {
        if (uniquesInstance == null)
            return uniquesInstance = new Singleton();
        return uniquesInstance;
    }
}
