package com.example.car;

/**
 * Интерфейс, представляющий двигатель.
 */
public interface Engine {

    /**
     * Возвращает тип двигателя.
     */
    String getType();

    /**
     * Возвращает мощность двигателя в лошадиных силах.
     */
    int getPower();
}