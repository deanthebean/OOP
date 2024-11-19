package ch.hslu.oop.sw05;

public class Square extends Shape{
    public Square(int x, int y, int size) {
        super(x, y);
        rectangle = new Rectangle(x, y, size, size);
    }

    private Rectangle rectangle;

    @Override
    public int getPerimeter() {
        return rectangle.getPerimeter();
    }

    @Override
    public int getArea() {
        return rectangle.getArea();
    }

    public void changeSize(final int newSize) {
        rectangle.changeDimensions(newSize, newSize);
    }
}
