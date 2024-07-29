package org.example.p1;

import lombok.Data;

@Data
public class Car {

    float fuelTankSize;
    String fuelType;
    int gears;
    float consumptionPerKilometer;
    float availableFuel;
    float tireSize;

    public Car(float fuelTankSize, String fuelType, int gears, float consumptionPerKilometer, float availableFuel, float tireSize) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPerKilometer = consumptionPerKilometer;
        this.availableFuel = availableFuel;
        this.tireSize = tireSize;
    }

    public float getFuelTankSize() {
        return fuelTankSize;
    }

    public void setFuelTankSize(float fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public float getConsumptionPerKilometer() {
        return consumptionPerKilometer;
    }

    public void setConsumptionPerKilometer(float consumptionPerKilometer) {
        this.consumptionPerKilometer = consumptionPerKilometer;
    }

    public float getAvailableFuel() {
        return availableFuel;
    }

    public void setAvailableFuel(float availableFuel) {
        this.availableFuel = availableFuel;
    }

    public float getTireSize() {
        return tireSize;
    }

    public void setTireSize(float tireSize) {
        this.tireSize = tireSize;
    }
}
