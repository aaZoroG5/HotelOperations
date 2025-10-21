package com.pluralsight;

public class Reservations {
    private String roomType;
 //   private double price;  REMOVED THIS because we are creating a derived getter that calculates the prices using the roomType method
    private double numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservations(String roomType, boolean isWeekend, double numberOfNights) {
        this.roomType = roomType;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    //getters and setters
    public double getNumberOfNights() {
        return numberOfNights;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(double numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    //derived getters
    public double getPrice() {
        if(this.getRoomType().equalsIgnoreCase("king")){
            return 139.00;
        }
        else {
            return 124.00;
        }
    }

    public double getReservationTotal() {
        //calculate the hotel total
        double hotelTotal = this.getNumberOfNights() * this.getPrice();

        //calculate the weekend price
        if(this.isWeekend()){
            hotelTotal = hotelTotal * 1.1;
        }
        return hotelTotal;
    }
}
