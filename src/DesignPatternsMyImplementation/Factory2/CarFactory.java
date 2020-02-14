package DesignPatternsMyImplementation.Factory2;

public class CarFactory {

    public static Car getCar(Brands brand) {
        switch (brand) {
            case TESLA:
                return new Tesla();
            case MERCEDES:
                return new Mercedes();
            default:
                return null;
        }
    }
}
