package DesignPatternsMyImplementation.Factory.HomeTypes;

import DesignPatternsMyImplementation.Factory.Room;
import DesignPatternsMyImplementation.Factory.RoomType;

public class BigHouse extends Home {

    public void thisIsBIGHOUSEaMethod() {
        System.out.println("BIGHOUSE METHOD");
    }


    @Override
    public void createHome() {
        addRoom(new Room(RoomType.BEDROOM));
        addRoom(new Room(RoomType.MASTERBEDROOM));
        addRoom(new Room(RoomType.BEDROOM));
        addRoom(new Room(RoomType.BATHROOM));
        addRoom(new Room(RoomType.BATHROOM));
        addRoom(new Room(RoomType.KITCHEN));
        addRoom(new Room(RoomType.LIVINGROOM));
        addRoom(new Room(RoomType.GARAGE));
        addRoom(new Room(RoomType.MANSCAVE));
        addRoom(new Room(RoomType.CHILDROOM));
        addRoom(new Room(RoomType.OFFICE));
        addRoom(new Room(RoomType.GUESTROOM));


    }


}
