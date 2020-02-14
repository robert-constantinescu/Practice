package DesignPatternsMyImplementation.Builder.HomeBuilder;

public class HomeBuilderDemo {

    public static void main(String[] args) {
        HomeBuilder.Builder house = new HomeBuilder.Builder();
        house.addRoom("Living");
        house.addRoom("Kitchen");
        house.addRoom("Bathroom");
        house.addRoom("Bedroom");
        System.out.println(house);
        HomeBuilder home = house.build();
        System.out.println(home.getRooms());
        System.out.println(home);

        HomeBuilder.Builder house1 = new HomeBuilder.Builder();
        house1.addRoom("Living");
        house1.addRoom("Kitchen");
        house1.addRoom("Bathroom");
        house1.addRoom("Bedroom");
        house1.addRoom("Menscave");

        System.out.println(house1);

        HomeBuilder home1 = house1.build();

        System.out.println(home1.getRooms());
        System.out.println(home1);

    }
}
