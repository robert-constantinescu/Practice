package DesignPatternsMyImplementation.Factory2;

public class Mercedes extends Car{

    @Override
    public void createCar() {
        this.setBrand("Mercedes");
        this.setModel("E Klasse");
        System.out.println("A " + this.getBrand() + " model: " + this.getModel() + " was created. With serie " + this.getSerie());
    }
}
