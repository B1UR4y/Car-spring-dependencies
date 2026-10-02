# Автомобиль и двигатели (Spring DI, XML-конфигурация)

Консольное Java-приложение с иерархией `Engine -> PetrolEngine, ElectricEngine`
и зависимым классом `Car`. Демонстрирует механизм внедрения зависимостей
в Spring Framework с использованием XML-конфигурации:

- внедрение простых значений через конструктор;
- внедрение зависимости по ссылке через конструктор;
- внедрение простых значений из внешнего файла `car.properties` через setter.

## Требования

- JDK 17+ (проект собран и проверен на JDK 23)
- Apache Maven 3.9+
- Интернет для первой сборки - Maven должен скачать зависимости Spring

Ссылка на релизы Apache Maven: https://maven.apache.org/download.cgi  
Ссылка на релизы JDK: https://www.oracle.com/java/technologies/downloads/

## Сборка

В командной строке из корня проекта (директория `Car-spring-dependencies`):

```bash
mvn clean package
```

## Запуск

### Windows

```cmd
java -jar target\CIS2-1.0-SNAPSHOT.jar
```

### Linux / macOS

```bash
java -jar target/CIS2-1.0-SNAPSHOT.jar
```