package ch.hslu.science;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTest {
    @Test
    void temperatureConstructorWithoutParam(){
        Temperature temperature = new Temperature();
        assertEquals(temperature.getTemperatureCelsius(), 20f);
    }

    @Test
    void temperatureConstructorWithParam(){
        Temperature temperature = new Temperature(25f);
        assertEquals(temperature.getTemperatureCelsius(), 25f);
    }

    @Test
    void temperatureSetter(){
        Temperature temperature = new Temperature();
        temperature.setTemperatureCelsius(30f);
        assertEquals(temperature.getTemperatureCelsius(), 30f);
    }

    @Test
    void testKelvinConversion(){
        Temperature temperature = new Temperature();
        assertEquals(temperature.getTemperatureInKelvin(), (20f + 273.15f));
    }

    @Test
    void testFahrenheitConversion(){
        Temperature temperature = new Temperature();
        assertEquals(temperature.getTemperatureInFahrenheit(), (20f * 1.8f + 32f));
    }

    @Test
    void testCelsiusTemperatureChange(){
        Temperature temperature = new Temperature();
        temperature.changeCelsiusTemperatureBy(12f);
        assertEquals(temperature.getTemperatureCelsius(), 32f);

        temperature.changeCelsiusTemperatureBy(-23f);
        assertEquals(temperature.getTemperatureCelsius(), 9f);
    }

    @Test
    void testKelvinTemperatureChange(){
        Temperature temperature = new Temperature();
        temperature.changeKelvinTemperatureBy(4f);
        assertEquals(temperature.getTemperatureCelsius(), 24f);

        temperature.changeKelvinTemperatureBy(-25f);
        assertEquals(temperature.getTemperatureCelsius(), -1f);
    }
}