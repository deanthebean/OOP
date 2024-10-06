package ch.hslu.science;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int GetQuadrant(){
        if(x >= 0 && y >= 0){
            return 1;
        } else if(x >= 0 && y < 0){
            return 2;
        } else if(x < 0 && y < 0){
            return 3;
        } else {
            return 4;
        }
    }
}
