package DesignPatternsMyImplementation.Builder.HomeBuilder;

import java.util.ArrayList;
import java.util.List;

public class HomeBuilder {


    public static class Builder {
        private List<String> rooms =new ArrayList<>();

        public Builder() {

        }

        public HomeBuilder build() {
            return new HomeBuilder(this);
        }

        public void addRoom(String room) {
            rooms.add(room);
        }
    }


    private final List<String> rooms;

    private HomeBuilder(Builder builder) {
        this.rooms = builder.rooms;
    }

    public List<String> getRooms() {
        return rooms;
    }


}
