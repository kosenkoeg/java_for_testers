package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectengleTests {

    @Test
    void canCalculateArea() {
        double result = Rectangle.Area(2.0, 4.0);
        Assertions.assertEquals(8.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(12.0, Rectangle.perimeter(2.0, 4.0));
    }
}
