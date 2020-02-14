package DesignPatternsMyImplementation.Factory2;

public class Tesla extends Car{

    @Override
    public void createCar() {
        setBrand("Tesla");
        setModel("Model 3");
        System.out.println("A " + this.getBrand() + " model: " + this.getModel() + " was created. With serie " + this.getSerie());
    }
}
