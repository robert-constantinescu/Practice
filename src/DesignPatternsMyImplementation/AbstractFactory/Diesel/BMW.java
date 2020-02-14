package DesignPatternsMyImplementation.AbstractFactory.Diesel;

import DesignPatternsMyImplementation.AbstractFactory.Car;

public class BMW extends Car {


    @Override
    public void createCar() {
        this.setBrand("BMW");
        this.setModel("Serie 3");
        this.setElectric(false);
        System.out.println("A " + this.getBrand() + " model: " + this.getModel() + " was created. Is electric : " + this.isElectric());
    }
}
