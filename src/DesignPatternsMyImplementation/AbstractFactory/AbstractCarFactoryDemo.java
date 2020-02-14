package DesignPatternsMyImplementation.AbstractFactory;

import DesignPatternsMyImplementation.AbstractFactory.Factories.AbstractCarFactory;


public class AbstractCarFactoryDemo {

    public static void main(String[] args) {
        boolean isElectric = true;
        AbstractCarFactory electricCarFactory = AbstractCarFactory.getCarFactory(isElectric);
        Car electric =electricCarFactory.getCar(Brand.TESLA);

        AbstractCarFactory dieselFactory = AbstractCarFactory.getCarFactory(!isElectric);

        Car diesel = dieselFactory.getCar(Brand.MERCEDES);



        }

}
