package model;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid() {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    public String classify() {
        if (!isValid()) {
            return "Треугольник не существует.";
        }

        if (a == b && b == c) {
            return "Равносторонний треугольник.";
        } else if (a == b || b == c || a == c) {
            return "Равнобедренный треугольник.";
        } else {
            return "Разносторонний треугольник.";
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}