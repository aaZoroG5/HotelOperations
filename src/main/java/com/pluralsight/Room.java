package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    //create a roo constructor
    public Room(boolean isOccupied, double price, int numberOfBeds, boolean isDirty) {
        this.isOccupied = isOccupied;
        this.price = price;
        this.numberOfBeds = numberOfBeds;
        this.isDirty = isDirty;
    }

    //room class getter and setters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    //this method checks if the room is available
    public boolean isAvailable(){
        if (!this.isOccupied() && !this.isDirty()) {
            return true;
        }
        return false;
    }

    public void checkIn(){
        if(this.isOccupied){
            this.setOccupied(true);
            this.setDirty(true);
        }
        else{
            System.out.println("This room is occupied");
        }
    }

    public void checkOut(){
        this.cleanroom();
        this.setOccupied(false);
    }

    public void cleanroom(){
        this.setDirty(false);
    }
}
