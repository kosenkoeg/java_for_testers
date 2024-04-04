package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectengleTests {

    @Test
    void canCalculateArea() {
        var r = new Rectangle(2.0, 4.0);
        double result = r.area();
        Assertions.assertEquals(8.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(12.0, new Rectangle(2.0, 4.0).perimeter());
    }
}
