package DesignPatternsMyImplementation.AbstractFactory.Factories;

import DesignPatternsMyImplementation.AbstractFactory.Brand;
import DesignPatternsMyImplementation.AbstractFactory.Car;


public abstract class AbstractCarFactory {

    public static AbstractCarFactory getCarFactory(boolean electric) {
        if(electric) {
            return new ElectricCarFactory();
        }else {
            return new DieselCarFactory();
        }

    }

    public abstract Car getCar(Brand brand);
}
