package DesignPatternsMyImplementation.Factory;

import DesignPatternsMyImplementation.Factory.HomeTypes.*;

public class DemoHomeFactory {

    public static void main(String[] args) {
        Home newHome =  HomeFactory.getHome(HomeType.VILLA);
        BigHouse bigHouse = (BigHouse) newHome;
        bigHouse.thisIsBIGHOUSEaMethod();
        System.out.println(newHome.getRooms());

        House newHouse = (House) HomeFactory.getHome(HomeType.HOUSE);
        newHouse.thisIsTHEHOUSEaMethod();
        System.out.println(newHouse.getRooms());

        Apartment newAp = (Apartment) HomeFactory.getHome(HomeType.APARTMENT);
        newAp.thisIsTHEAPARTMENTaMethod();
        System.out.println(newAp.getRooms());


        System.out.println(newHome);

    }
}
