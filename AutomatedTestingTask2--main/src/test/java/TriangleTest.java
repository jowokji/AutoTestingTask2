import model.Triangle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    // Обычные тесты

    @Test
    void testEquilateralTriangle() {
        Triangle triangle = new Triangle(3, 3, 3);
        assertEquals("Равносторонний треугольник.", triangle.classify());
    }

    @Test
    void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(5, 5, 3);
        assertEquals("Равнобедренный треугольник.", triangle.classify());
    }

    @Test
    void testScaleneTriangle() {
        Triangle triangle = new Triangle(6, 8, 10);
        assertEquals("Разносторонний треугольник.", triangle.classify());
    }

    @Test
    void testNoTriangle() {
        Triangle triangle = new Triangle(3, 3, 0);
        assertEquals("Треугольник не существует.", triangle.classify());
    }

    @Test
    void testZeroSide() {
        Triangle triangle = new Triangle(0, 5, 7);
        assertEquals("Треугольник не существует.", triangle.classify());
    }

    @Test
    void testNegativeSide() {
        Triangle triangle = new Triangle(-5, 5, 7);
        assertEquals("Треугольник не существует.", triangle.classify());
    }

    @Test
    void testInvalidTriangle() {
        Triangle triangle = new Triangle(10, 4, 3);
        assertEquals("Треугольник не существует.", triangle.classify());
    }

    // Параметризированный тест

    @ParameterizedTest
    @CsvSource({
            "3, 3, 3, 'Равносторонний треугольник.'",
            "5, 5, 3, 'Равнобедренный треугольник.'",
            "6, 8, 10, 'Разносторонний треугольник.'",
            "4, 3, 2, 'Разносторонний треугольник.'",
            "0, 5, 7, 'Треугольник не существует.'",
            "-5, 5, 7, 'Треугольник не существует.'"
    })
    void testTriangleClassification(int a, int b, int c, String expected) {
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(expected, triangle.classify());
    }
}
