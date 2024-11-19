package ch.hslu.oop.sw05;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 3);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println();

        Rectangle rectangle = new Rectangle(0, 0, 3, 10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println();

        Square square = new Square(0, 0, 5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println();

        Nitrogen nitrogen = new Nitrogen();
        System.out.println(nitrogen.getAggregateState(200f));

        Mercury mercury = new Mercury();
        System.out.println(mercury.getAggregateState(200f));

        Lead lead = new Lead();
        System.out.println(lead.getAggregateState(200f));
        lead.switchOn();
        lead.switchOff();
        lead.switchOn();
        lead.switchOff();
        System.out.printf("" + lead.getSwitchCount());
    }
}
