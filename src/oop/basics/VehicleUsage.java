package oop.basics;

/*
 * This class demonstrates how to create and use objects from the Car and Van classes.
 * It shows how to set attributes using setters, retrieve values using getters,
 * and how inheritance works with the Van class extending Car.
 */

public class VehicleUsage {

    public static void main(String[] args) {

        Car renault = new Car();

        renault.setHeight(1121.2);
        renault.setWidth(3030.2);
        renault.setColor("green");

        renault.start();

        Car mazda = new Car();

        mazda.setHeight(23.2);
        mazda.setWidth(213.2);
        mazda.setColor("red");

        mazda.turn();
        mazda.setWheels(3);

        System.out.println("The car has " + mazda.getWheels() + " wheels.");
        System.out.println("Mazda color: " + mazda.getColor());
        System.out.println("Renault color: " + renault.getColor());

        Car ferrari = new Car();

        System.out.println("Ferrari has " + ferrari.getWheels() + " wheels and color " + ferrari.getColor());

        ferrari.setLeatherSeats("yes");

        System.out.println("Ferrari weight: " + ferrari.getWeight());

        Van kangoo = new Van(6, 100);

        kangoo.setColor("blue");
        kangoo.setLeatherSeats("yes");
        kangoo.setAirConditioning("yes");

        System.out.println("Color: " + kangoo.getColor() + " | " + kangoo.getVanData());
    }
}


