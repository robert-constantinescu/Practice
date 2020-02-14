package DesignPatternsMyImplementation.Factory2;

public class DemoCarFactory {

    public static void main(String[] args) {



        for (int i = 0; i <= 10; i++) {
            CarFactory.getCar(Brands.TESLA);
            for (int j = i; j <= 20; j++) {
                CarFactory.getCar(Brands.MERCEDES);            }
        }

    }


}
