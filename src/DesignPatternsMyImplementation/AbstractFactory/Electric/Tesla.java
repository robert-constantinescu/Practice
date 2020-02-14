package DesignPatternsMyImplementation.AbstractFactory.Electric;

import DesignPatternsMyImplementation.AbstractFactory.Car;

public class Tesla extends Car {

    @Override
    public void createCar() {
        this.setBrand("Tesla");
        this.setModel("Model S");
        this.setElectric(true);
        System.out.println("A " + this.getBrand() + " model: " + this.getModel() + " was created. Is electric : " + this.isElectric());
    }
}
