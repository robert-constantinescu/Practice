package DesignPatternsMyImplementation.AbstractFactory.Electric;

import DesignPatternsMyImplementation.AbstractFactory.Car;

public class Smart extends Car {

    @Override
    public void createCar() {
        this.setBrand("Smart");
        this.setModel("ForFor");
        this.setElectric(true);
        System.out.println("A " + this.getBrand() + " model: " + this.getModel() + " was created. Is electric : " + this.isElectric());
    }


}
