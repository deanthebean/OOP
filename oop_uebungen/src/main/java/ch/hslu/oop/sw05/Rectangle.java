package ch.hslu.oop.sw05;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void changeDimensions(final int newWidth, final int newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }



    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getPerimeter(){
        return (width*2) + (height*2);
    }

    @Override
    public int getArea(){
        return width*height;
    }
}
