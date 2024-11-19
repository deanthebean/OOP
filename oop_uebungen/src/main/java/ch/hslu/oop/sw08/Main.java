package ch.hslu.oop.sw08;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        Mercury mercury = new Mercury();

        System.out.println("Mercury ist bei " + temperature.getTemperatureCelsius() + "°C " + mercury.getAggregateState(temperature.getTemperatureCelsius()).getGermanTerm());
    }
}
