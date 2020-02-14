package DesignPatternsMyImplementation.AbstractFactory.Diesel;

import DesignPatternsMyImplementation.AbstractFactory.Car;

public class Mercedes extends Car {


    @Override
    public void createCar() {
        this.setBrand("Mercedes");
        this.setModel("C Klasse");
        this.setElectric(false);
        System.out.println("A " + this.getBrand() + " model: " + this.getModel() + " was created. Is electric : " + this.isElectric());

    }
}
