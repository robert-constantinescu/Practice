package DesignPatterns.Creational.FactoryPattern;

import java.util.Calendar;

class DemoCalendarFactory {

    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
