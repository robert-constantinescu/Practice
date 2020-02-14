package DesignPatternsMyImplementation.AbstractFactory.Factories;

import DesignPatternsMyImplementation.AbstractFactory.Brand;
import DesignPatternsMyImplementation.AbstractFactory.Car;
import DesignPatternsMyImplementation.AbstractFactory.Electric.Nissan;
import DesignPatternsMyImplementation.AbstractFactory.Electric.Smart;
import DesignPatternsMyImplementation.AbstractFactory.Electric.Tesla;

public class ElectricCarFactory extends AbstractCarFactory {

    @Override
    public Car getCar(Brand brand) {
        switch (brand) {
            case TESLA:
                return new Tesla();
            case SMART:
                return new Smart();
            case NISSAN:
                return new Nissan();
            default:
               return null;
        }
    }
}
