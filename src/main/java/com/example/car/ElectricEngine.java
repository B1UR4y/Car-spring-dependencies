package com.example.car;

/**
 * Электрический двигатель.
 * Содержит собственное поле — batteryCapacity (ёмкость батареи).
 */
public class ElectricEngine implements Engine {

    private final double batteryCapacity;

    private final int power;

    // Внедрение простых значений через конструктор
    public ElectricEngine(double batteryCapacity, int power) {
        this.batteryCapacity = batteryCapacity;
        this.power = power;
    }

    @Override
    public String getType() {
        return "Электрический (батарея " + batteryCapacity + " кВт*ч)";
    }

    @Override
    public int getPower() {
        return power;
    }
}