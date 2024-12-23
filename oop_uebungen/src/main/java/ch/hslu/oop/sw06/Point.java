package ch.hslu.oop.sw06;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this(point.x, point.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getQuadrant(){
        if(x > 0 && y > 0){
            return 1;
        } else if(x > 0 && y < 0){
            return 2;
        } else if(x < 0 && y < 0){
            return 3;
        } else if(x < 0 && y > 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public void moveRelative(int x, int y){
        this.x += x;
        this.y += y;
    }

    public void moveRelative(Point point){
        this.x += point.x;
        this.y += point.y;
    }

    public void moveRelative(double angle, int distance){
        this.x += distance * Math.cos(Math.toRadians(angle));
        this.y += distance * Math.sin(Math.toRadians(angle));
    }
}