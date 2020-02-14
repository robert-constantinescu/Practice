package DesignPatternsMyImplementation.Factory2;

public abstract class Car {

    private String brand;
    private String model;
    private static int serie;

    public Car() {
        serie++;
        this.createCar();
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public abstract void createCar();

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
}
