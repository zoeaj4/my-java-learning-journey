package oop.basics;

/*
 * This class represents a Van that extends the Car class.
 * It adds specific attributes such as load capacity and extra seats.
 * This example demonstrates inheritance in Object-Oriented Programming (OOP).
 */

public class Van extends Car {

    private int loadCapacity;
    private int extraSeats;

    public Van(int extraSeats, int loadCapacity) {
        super();
        this.loadCapacity = loadCapacity;
        this.extraSeats = extraSeats;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getExtraSeats() {
        return extraSeats;
    }

    public void setExtraSeats(int extraSeats) {
        this.extraSeats = extraSeats;
    }

    public String getVanData() {
        return "Load capacity: " + loadCapacity + " | Extra seats: " + extraSeats;
    }
}

