package ch.hslu.science;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(int pXStart, int pYStart, int pXEnd, int pYEnd) {
        this.startPoint = new Point(pXStart, pYStart);
        this.endPoint = new Point(pXEnd, pYEnd);
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setStartPoint(int pX, int pY) {
        startPoint.setX(pX);
        startPoint.setY(pY);
    }

    public void setEndPoint(int pX, int pY) {
        endPoint.setX(pX);
        endPoint.setY(pY);
    }
}
