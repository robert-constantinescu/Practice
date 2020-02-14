package DesignPatternsMyImplementation.AbstractFactory.Factories;

import DesignPatternsMyImplementation.AbstractFactory.Brand;
import DesignPatternsMyImplementation.AbstractFactory.Car;
import DesignPatternsMyImplementation.AbstractFactory.Diesel.BMW;
import DesignPatternsMyImplementation.AbstractFactory.Diesel.Mercedes;

public class DieselCarFactory extends AbstractCarFactory{

    @Override
    public Car getCar(Brand brand) {
        switch (brand){
            case MERCEDES:
                return new Mercedes();
            case BMW:
                return new BMW();
            default:
                return null;
        }
    }
}
