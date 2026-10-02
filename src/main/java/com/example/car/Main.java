package com.example.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Точка входа в приложение.
 * Загружает Spring-контекст из XML-файла и получает готовые бины.
 */
public class Main {

    public static void main(String[] args) {
        // Загружает контекст Spring из XML-конфигурации
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получает бин автомобиля с бензиновым двигателем
        Car petrolCar = context.getBean("petrolCar", Car.class);
        petrolCar.describe();

        // Получает бин автомобиля с электрическим двигателем
        Car electricCar = context.getBean("electricCar", Car.class);
        electricCar.describe();

        // Закрывает контекст
        ((ClassPathXmlApplicationContext) context).close();
    }
}