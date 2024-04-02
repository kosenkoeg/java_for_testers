package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        double result = Math.sqrt(Triangle.Area(6.0, 8.0, 10.0));
        Assertions.assertEquals(24.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(24.0, Triangle.Perimeter(6.0, 8.0, 10.0));
    }
}
