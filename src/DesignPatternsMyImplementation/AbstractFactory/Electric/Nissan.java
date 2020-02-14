package DesignPatternsMyImplementation.AbstractFactory.Electric;

import DesignPatternsMyImplementation.AbstractFactory.Car;

public class Nissan extends Car {

    @Override
    public void createCar() {
        this.setBrand("Nissan");
        this.setModel("Leaf");
        this.setElectric(true);
        System.out.println("A " + this.getBrand() + " model: " + this.getModel() + " was created. Is electric : " + this.isElectric());
    }
}
