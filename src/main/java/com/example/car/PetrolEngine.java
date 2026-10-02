package com.example.car;

/**
 * Бензиновый двигатель.
 * Содержит собственное поле - fuelType (тип топлива).
 */
public class PetrolEngine implements Engine {

    private final String fuelType;

    private final int power;

    // Внедрение простых значений через конструктор
    public PetrolEngine(String fuelType, int power) {
        this.fuelType = fuelType;
        this.power = power;
    }

    @Override
    public String getType() {
        return "Бензиновый (" + fuelType + ")";
    }

    @Override
    public int getPower() {
        return power;
    }
}