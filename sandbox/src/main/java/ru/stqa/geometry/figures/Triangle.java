package ru.stqa.geometry.figures;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static void printTriangleArea(Triangle t) {
        var text = String.format("Площадь треугольника со сторонами %f, %f и %f = %f", t.side1, t.side2, t.side3, t.area());
        System.out.println(text);
    }

    public static void printTrianglePerimeter(Triangle t) {
        var text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", t.side1, t.side2, t.side3, t.perimeter());
        System.out.println(text);
    }

    public double semiPerimeter() {
        return perimeter() / 2 ;
    }

    public double area() {
        var p = semiPerimeter();
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }
}
