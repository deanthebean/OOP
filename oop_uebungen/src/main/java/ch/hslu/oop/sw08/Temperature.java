package ch.hslu.oop.sw08;

public final class Temperature implements Comparable<Temperature> {

    private static final float KELVIN_OFFSET = 273.15f;
    private float temperatureCelsius;

    public Temperature() {
        this.temperatureCelsius = 20f;
    }

    public Temperature(float temperature) {
        this.temperatureCelsius = temperature;
    }

    public float getTemperatureCelsius(){
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(float tempCelsius){
        this.temperatureCelsius = tempCelsius;
    }

    public float getTemperatureInKelvin(){
        return celsiusToKelvin(temperatureCelsius);
    }

    public float getTemperatureInFahrenheit(){
        return temperatureCelsius * 1.8f + 32;
    }

    public void changeCelsiusTemperatureBy(float tempDiffCelsius){
        temperatureCelsius += tempDiffCelsius;
    }

    public void changeKelvinTemperatureBy(float tempDiffKelvin){
        temperatureCelsius = kelvinToCelsius(getTemperatureInKelvin() + tempDiffKelvin);
    }

    public static float celsiusToKelvin(float celsius){
        return celsius + KELVIN_OFFSET;
    }

    public static float kelvinToCelsius(float kelvin){
        return kelvin - KELVIN_OFFSET;
    }

    @Override
    public boolean equals(final Object temp) {
        if (this == temp) {
            return true;
        } else if (!(temp instanceof Temperature)) {
            return false;
        }
        return this.temperatureCelsius == (((Temperature)temp).getTemperatureCelsius());
    }

    @Override
    public int hashCode(){
        return Float.hashCode(temperatureCelsius);
    }

    @Override
    public int compareTo(Temperature temperature){
        return Float.compare(this.getTemperatureCelsius(), temperature.getTemperatureCelsius());
    }

    @Override
    public String toString() {
        return "Temperature [celsius=" + temperatureCelsius + ", kelvin=" + celsiusToKelvin(temperatureCelsius) + "]";
    }
}
