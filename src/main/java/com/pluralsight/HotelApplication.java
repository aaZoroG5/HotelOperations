package com.pluralsight;

public class HotelApplication {

    public static void main(String[] args) {

        Room standardRoom = new Room(false, 40, 2, true);

        System.out.println("Is the room available: " + standardRoom.isAvailable());

        //change property to make roo available
        standardRoom.setDirty(false);
        System.out.println("Is the room available: " + standardRoom.isAvailable());

        Reservations andy = new Reservations("King", false, 3);

        //check the price of the room
        System.out.println("Room price: " + andy.getPrice());

        //check the hotel total
        System.out.println("Hotel price: " + andy.getReservationTotal());


    }

}
