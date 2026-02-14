package oop.basics;

/*
 * This class represents a Car object with different attributes such as size,
 * weight, color, and optional features like air conditioning and leather seats.
 * It uses encapsulation with private attributes and public getters and setters.
 * The final price and weight are calculated based on selected features.
 */

public class Car {

    private double width;
    private double height;
    private double weight;
    private double baseWeight;
    private String color;
    private int wheels;
    private boolean airConditioning;
    private boolean leatherSeats;
    private double basePrice;
    private double finalPrice;

    public Car() {
        wheels = 4;
        height = 400.5;
        width = 700.7;
        color = "red";
        basePrice = 1000.3;
        baseWeight = 500.4;
        weight = baseWeight;
        finalPrice = basePrice;
    }

    public void start() {
        // Car starts
    }

    public void brake() {
        // Car brakes
    }

    public void turn() {
        // Car turns
    }

    public void setWheels(int wheels) {
        if (wheels != 4) {
            System.out.println("The number of wheels must be 4.");
        } else {
            this.wheels = wheels;
        }
    }

    public int getWheels() {
        return wheels;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("Width cannot be negative.");
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    private void calculateWeight() {
        weight = baseWeight;

        if (airConditioning) {
            weight += 1000;
        }
        if (leatherSeats) {
            weight += 0.5;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBaseWeight() {
        return baseWeight;
    }

    public void setBaseWeight(double baseWeight) {
        this.baseWeight = baseWeight;
    }

    public String hasAirConditioning() {
        if (airConditioning) {
            return "The car has air conditioning.";
        } else {
            return "The car has standard ventilation.";
        }
    }

    public void setAirConditioning(String option) {
        if (option.equalsIgnoreCase("yes")) {
            this.airConditioning = true;
        } else {
            this.airConditioning = false;
        }

        calculateFinalPrice();
        calculateWeight();
    }

    public String hasLeatherSeats() {
        if (leatherSeats) {
            return "The car has leather seats.";
        } else {
            return "The car does not have leather seats.";
        }
    }

    public void setLeatherSeats(String option) {
        if (option.equalsIgnoreCase("yes")) {
            this.leatherSeats = true;
        } else {
            this.leatherSeats = false;
        }

        calculateFinalPrice();
        calculateWeight();
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    private void calculateFinalPrice() {
        finalPrice = basePrice;

        if (airConditioning) {
            finalPrice += 1000;
        }
        if (leatherSeats) {
            finalPrice += 500;
        }
    }
}

