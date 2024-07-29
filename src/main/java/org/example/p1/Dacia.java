package org.example.p1;

public class Dacia extends Car {

    int chassisNumber;

    public Dacia(float fuelTankSize, String fuelType, int gears, float consumptionPerKilometer, float availableFuel, float tireSize, int chassisNumber) {
        super(fuelTankSize, fuelType, gears, consumptionPerKilometer, availableFuel, tireSize);
        this.chassisNumber = chassisNumber;
    }
}
