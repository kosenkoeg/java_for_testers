package ru.stqa.geometry.figures;

public class Rectangle {
    public static void printRectangleArea(double a, double b) {
        var text = String.format("Площадь прямоугольника со сторонами %f и %f = %f", a, b, Area(a, b));
        System.out.println(text);
    }

    public static double Area(double a, double b) {
        return a * b;
    }

    public static double perimeter(double a, double b) {
        return 2 * (a + b);
    }
}
