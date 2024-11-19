package ch.hslu.oop.sw05;

public class Circle extends Shape {
    private int diameter;

    public Circle (final int x, final int y, final int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public void setDiameter(final int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public int getPerimeter(){
        return (int)(diameter * 3.14);
    }

    public float getPerimeterAsFloat(){
        return diameter * 3.14f;
    }

    @Override
    public int getArea(){
        float radius = diameter / 2f;
        return (int)(radius * radius * 3.14f);
    }
}
