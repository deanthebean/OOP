package ch.hslu.oop.sw08;

import ch.hslu.oop.sw08.Temperature;
import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.cartesian.CartesianTest;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void temperatureConstructorWithoutParam(){
        ch.hslu.science.Temperature temperature = new ch.hslu.science.Temperature();
        assertEquals(temperature.getTemperatureCelsius(), 20f);
    }

    @Test
    void temperatureConstructorWithParam(){
        ch.hslu.science.Temperature temperature = new ch.hslu.science.Temperature(25f);
        assertEquals(temperature.getTemperatureCelsius(), 25f);
    }

    @Test
    void temperatureSetter(){
        ch.hslu.science.Temperature temperature = new ch.hslu.science.Temperature();
        temperature.setTemperatureCelsius(30f);
        assertEquals(temperature.getTemperatureCelsius(), 30f);
    }

    @Test
    void testCelsiusToKelvin(){
        assertEquals(Temperature.celsiusToKelvin(20f), 293.15f);
    }

    @Test
    void testKelvinToCelsius(){
        assertEquals(Temperature.kelvinToCelsius(293.15f), 20f);
    }

    @Test
    void testKelvinConversion(){
        ch.hslu.science.Temperature temperature = new ch.hslu.science.Temperature();
        assertEquals(temperature.getTemperatureInKelvin(), 293.15f);
    }

    @Test
    void testFahrenheitConversion(){
        ch.hslu.science.Temperature temperature = new ch.hslu.science.Temperature();
        assertEquals(temperature.getTemperatureInFahrenheit(), 68f);
    }

    @Test
    void testCelsiusTemperatureChange(){
        ch.hslu.science.Temperature temperature = new ch.hslu.science.Temperature();
        temperature.changeCelsiusTemperatureBy(12f);
        assertEquals(temperature.getTemperatureCelsius(), 32f);

        temperature.changeCelsiusTemperatureBy(-23f);
        assertEquals(temperature.getTemperatureCelsius(), 9f);
    }

    @Test
    void testKelvinTemperatureChange(){
        ch.hslu.science.Temperature temperature = new ch.hslu.science.Temperature();
        temperature.changeKelvinTemperatureBy(4f);
        assertEquals(temperature.getTemperatureCelsius(), 24f);

        temperature.changeKelvinTemperatureBy(-25f);
        assertEquals(temperature.getTemperatureCelsius(), -1f);
    }

    @Test
    void testTemperatureCompareMethods(){
        Temperature temperature = new Temperature();
        assertTrue(temperature.equals(temperature));

        Temperature temperature2 = new Temperature(25f);
        assertFalse(temperature.equals(temperature2));
        assertEquals(temperature.compareTo(temperature2), -1);

        temperature.setTemperatureCelsius(25f);
        assertTrue(temperature.equals(temperature2));
        assertEquals(temperature.compareTo(temperature2), 0);
        assertEquals(temperature.hashCode(), temperature2.hashCode());

        temperature.setTemperatureCelsius(30f);
        assertEquals(temperature.compareTo(temperature2), 1);
    }

    @Test
    void testTemperaturVerlauf(){
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperature());
        temperaturVerlauf.add(new Temperature(25f));
        temperaturVerlauf.add(new Temperature(30f));
        assertEquals(3, temperaturVerlauf.getCount());
        temperaturVerlauf.add(new Temperature(-45f));
        temperaturVerlauf.add(new Temperature(65f));
        assertEquals(5, temperaturVerlauf.getCount());
        temperaturVerlauf.clear();
        assertEquals(0, temperaturVerlauf.getCount());
    }

    @Test
    void testTemperatureVerlaufEmptyList(){
        TemperaturVerlauf temperatureVerlauf = new TemperaturVerlauf();
        assertEquals(Float.MIN_VALUE, temperatureVerlauf.getMaxTemperature());
        assertEquals(Float.MAX_VALUE, temperatureVerlauf.getMinTemperature());
        assertEquals(Float.MAX_VALUE, temperatureVerlauf.getAverageTemperature());
    }
}