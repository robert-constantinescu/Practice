package DesignPatternsMyImplementation.AbstractFactory;

public abstract class Car {

    private String brand;
    private String model;
    private boolean electric;

    public abstract void createCar();

    public Car() {
        this.createCar();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
}
