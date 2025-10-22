package com.pluralsight;

public class Hotel {

    //create properties for hotel class
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedKingSuites;
    private int bookedBasicDouble;

    //create 2 constructors
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int bookedKingSuites, int numberOfRooms, int bookedBasicDouble) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.bookedKingSuites = bookedKingSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicDouble = bookedBasicDouble;
    }

    //generate getter methods
    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedKingSuites() {
        return bookedKingSuites;
    }

    public int getBookedBasicDouble() {
        return bookedBasicDouble;
    }
    //REVIEW
    //create derived methods that get available rooms/suites and book rooms/suites
    public int getAvailableSuites(){
        return this.getNumberOfSuites() - this.getBookedKingSuites();
    }

    public int getAvailableRooms(){
        return this.getNumberOfRooms() - this.getBookedBasicDouble();
    }
    public boolean bookRoom (int numberOfRooms, boolean isSuite){
        //create if statement that decides whether the user wants a king or double
        if(isSuite){
            if(numberOfRooms <= getAvailableSuites()){//check available king suites
                this.bookedBasicDouble = this.bookedBasicDouble + numberOfRooms;
                return true;
            }
        }
        else{
            if(numberOfRooms <= getAvailableRooms()){//check available basic doubles
                this.bookedBasicDouble = this.bookedBasicDouble + numberOfRooms;
                return true;
            }
        }
        //if rooms are not available return false
        return false;
    }
}
