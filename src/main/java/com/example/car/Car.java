package com.example.car;

/**
 * Автомобиль - зависимый класс.
 */
public class Car {

    // Зависимость - двигатель (внедряется по ссылке через конструктор)
    private final Engine engine;

    // Простое значение - модель автомобиля (внедряется через конструктор)
    private final String model;

    // Простое значение из внешнего файла (внедряется через setter)
    private int maxSpeed;

    /**
     * Конструктор для внедрения зависимости по ссылке и простого значения.
     *
     * @param engine двигатель (ссылочная зависимость)
     * @param model  модель автомобиля (простое значение)
     */
    public Car(Engine engine, String model) {
        this.engine = engine;
        this.model = model;
    }

    /**
     * Setter для внедрения простого значения из внешнего файла.
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Метод, который на основе вызова метода у зависимости
     * выводит сообщение в консоль.
     */
    public void describe() {
        System.out.println("=== Автомобиль: " + model + " ===");
        System.out.println("Двигатель: " + engine.getType());
        System.out.println("Мощность: " + engine.getPower() + " л.с.");
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч");
        System.out.println("Разгон: " + calculateAcceleration() + " с 0 до 100 км/ч");
        System.out.println();
    }

    /**
     * Расчёт разгона на основе мощности двигателя.
     */
    private double calculateAcceleration() {
        return Math.round((1500.0 / engine.getPower()) * 10.0) / 10.0;
    }
}