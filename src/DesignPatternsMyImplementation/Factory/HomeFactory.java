package DesignPatternsMyImplementation.Factory;

import DesignPatternsMyImplementation.Factory.HomeTypes.*;

public class HomeFactory {

    public static Home getHome(HomeType homeType) {
        switch (homeType) {
            case VILLA:
                return new BigHouse();
            case HOUSE:
                return  new House();
            case APARTMENT:
                return new Apartment();
            default:
                break;
        }
        return new Apartment();

    }
}
