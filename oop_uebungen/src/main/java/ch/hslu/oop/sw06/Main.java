package ch.hslu.oop.sw06;

import ch.hslu.oop.sw05.Shape;
import ch.hslu.oop.sw05.Circle;
import ch.hslu.oop.sw05.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(2, 3, 5);
        Shape shape2 = new Rectangle(1, 4, 6, 10);

        shape1.move(7, 3);
        int dia = ((Circle) shape1).getDiameter();

    }
}
