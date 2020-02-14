package DesignPatternsMyImplementation.Builder.CarBuilder;

public class CarBuilderDemo {

    public static void main(String[] args) {
        CarBuilder.Builder builder = new CarBuilder.Builder();
        builder.electric(true).engine("tesla engine").power(600).hasAutoPilot(true);

        CarBuilder carBuilder = builder.build();

        System.out.println(carBuilder.getEngine());
        System.out.println(carBuilder.getPower());
        System.out.println(carBuilder.isElectric());
        System.out.println(carBuilder.isHasAutopilot());

    }
}
