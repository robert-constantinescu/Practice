package DesignPatternsMyImplementation.Singleton;

public class SingletonDemo {

    public static void main(String[] args) {


        Singleton firstInstance = Singleton.getUniquesInstance();

        System.out.println(firstInstance);


        Singleton secondInstance = Singleton.getUniquesInstance();

        System.out.println(secondInstance);

        System.out.println(firstInstance==secondInstance);
    }
}
