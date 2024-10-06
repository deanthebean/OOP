package ch.hslu.science;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTest {
    Element nitrogen = new Element(-209.86f, -195.8f);
    Element mercury = new Element(-38.9f, 356.7f);
    Element lead = new Element(327.5f, 1744f);

    @Test
    void TemperatureConstructorWithoutParam(){
        Temperature temperature = new Temperature();
        assertEquals(temperature.GetTemperatureCelsius(), 20f);
    }

    @Test
    void TemperatureConstructorWithParam(){
        Temperature temperature = new Temperature(25f);
        assertEquals(temperature.GetTemperatureCelsius(), 25f);
    }

    @Test
    void TemperatureSetter(){
        Temperature temperature = new Temperature();
        temperature.SetTemperatureCelsius(30f);
        assertEquals(temperature.GetTemperatureCelsius(), 30f);
    }

    @Test
    void TestKelvinConversion(){
        Temperature temperature = new Temperature();
        assertEquals(temperature.GetTemperatureInKelvin(), (20f + 273.15f));
    }

    @Test
    void TestFahrenheitConversion(){
        Temperature temperature = new Temperature();
        assertEquals(temperature.GetTemperatureInFahrenheit(), (20f * 1.8f + 32f));
    }

    @Test
    void TestCelsiusTemperatureChange(){
        Temperature temperature = new Temperature();
        temperature.ChangeCelsiusTemperatureBy(12f);
        assertEquals(temperature.GetTemperatureCelsius(), 32f);

        temperature.ChangeCelsiusTemperatureBy(-23f);
        assertEquals(temperature.GetTemperatureCelsius(), 9f);
    }

    @Test
    void TestKelvinTemperatureChange(){
        Temperature temperature = new Temperature();
        temperature.ChangeKelvinTemperatureBy(4f);
        assertEquals(temperature.GetTemperatureCelsius(), 24f);

        temperature.ChangeKelvinTemperatureBy(-25f);
        assertEquals(temperature.GetTemperatureCelsius(), -1f);
    }

    @Test
    void testAggregateState(){
        Temperature temperature = new Temperature(200f);
        assertEquals(temperature.GetAggregateStateForElement(nitrogen), Element.AggregateState.Gas);
        assertEquals(temperature.GetAggregateStateForElement(mercury), Element.AggregateState.Liquid);
        assertEquals(temperature.GetAggregateStateForElement(lead), Element.AggregateState.Solid);
    }
}