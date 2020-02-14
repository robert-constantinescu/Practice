package DesignPatternsMyImplementation.Factory.HomeTypes;

import DesignPatternsMyImplementation.Factory.Room;
import DesignPatternsMyImplementation.Factory.RoomType;

public class Apartment extends Home {

    public void thisIsTHEAPARTMENTaMethod() {
        System.out.println("THE APARTMENT METHOD");
    }


    @Override
    public void createHome() {
        addRoom(new Room(RoomType.BEDROOM));
        addRoom(new Room(RoomType.BATHROOM));
        addRoom(new Room(RoomType.KITCHEN));
        addRoom(new Room(RoomType.LIVINGROOM));
    }



}
