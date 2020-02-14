package DesignPatternsMyImplementation.Factory.HomeTypes;

import DesignPatternsMyImplementation.Factory.Room;
import DesignPatternsMyImplementation.Factory.RoomType;

import java.util.ArrayList;
import java.util.List;

public abstract class Home {

    private List<Room> rooms = new ArrayList<>();
    private double surface;

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public Home(){
        this.createHome();
    }

    public abstract void createHome();


}
