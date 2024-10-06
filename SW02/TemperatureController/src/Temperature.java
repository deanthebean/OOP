public class Temperature {
    public Temperature() {
        this.temperatureCelsius = 20f;
    }

    public Temperature(float temperature) {
        this.temperatureCelsius = temperature;
    }

    private float temperatureCelsius;

    public float getTemperatureCelsius(){
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(float tempCelsius){
        this.temperatureCelsius = tempCelsius;
    }

    public float getTemperatureInKelvin(){
        return temperatureCelsius + 273.15f;
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

    private float kelvinToCelsius(float kelvin){
        return kelvin - 273.15f;
    }
}
