import model.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        while (true) {
            try {
                System.out.print("Введите сторону A треугольника: ");
                a = scanner.nextInt();

                System.out.print("Введите сторону B треугольника: ");
                b = scanner.nextInt();

                System.out.print("Введите сторону C треугольника: ");
                c = scanner.nextInt();

                break;

            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите целое число.");
                scanner.nextLine();
            }
        }
        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle.classify());
    }
}
