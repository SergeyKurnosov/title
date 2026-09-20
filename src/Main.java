import task_1.*;
import task_2.*;



void main(String[] args) {

    /*
Простая

Создай record Temperature(double celsius).
Требования:
Компактный конструктор должен бросать IllegalArgumentException, если celsius < -273.15 (абсолютный ноль — ниже физически невозможно).
Добавь обычный метод toFahrenheit(), который возвращает температуру в Фаренгейтах (celsius * 9/5 + 32).
Проверить: new Temperature(-300) должен падать с исключением, new Temperature(25).toFahrenheit() — возвращать 77.0.
     */
    System.out.println(new Temperature(25).toFahrenheit());
  //  Temperature temperature = new Temperature(-300);
  //  System.out.println(temperature);
//===============================================================================================
/*
Средняя
Дан интерфейс:

interface Shape {
    double area();
    double perimeter();
}

Создай record Rectangle(double width, double height) implements Shape.
Требования:
Компактный конструктор проверяет, что width > 0 и height > 0, иначе — IllegalArgumentException.
Реализуй area() и perimeter().
Напиши статический метод Rectangle square(double side), создающий квадрат (вызывает канонический конструктор с одинаковыми сторонами).
Проверить полиморфизм: создать Shape s = new Rectangle(3, 4); и вызвать s.area().
 */

    Shape s = new Rectangle(3, 4);
    System.out.println(s.area());

}


