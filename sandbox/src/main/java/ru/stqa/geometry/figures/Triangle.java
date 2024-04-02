package ru.stqa.geometry.figures;

public class Triangle {
    public static void printTriangleArea(double a, double b, double c) {
        var text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", a, b, c, Math.sqrt(Area(a, b, c)));
        System.out.println(text);
    }

    public static void printTrianglePerimeter(double a, double b, double c) {
        var text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", a, b, c, Perimeter(a, b, c));
        System.out.println(text);
    }

    public static double semiPerimeter (double a, double b, double c) {
        return (a + b + c) / 2 ;
    }

    public static double Area(double a, double b, double c) {
        var p = semiPerimeter(a, b, c);
        return p * (p - a) * (p - b) * (p - c);
    }

    public static double Perimeter(double a, double b, double c) {
        return a + b + c;
    }
}
