package ch.hslu.science;

public class Temperature {

    public Temperature() {
        this.temperatureCelsius = 20f;
    }

    public Temperature(float temperature) {
        this.temperatureCelsius = temperature;
    }

    private float temperatureCelsius;

    public float GetTemperatureCelsius(){
        return temperatureCelsius;
    }

    public void SetTemperatureCelsius(float tempCelsius){
        this.temperatureCelsius = tempCelsius;
    }

    public float GetTemperatureInKelvin(){
        return temperatureCelsius + 273.15f;
    }

    public float GetTemperatureInFahrenheit(){
        return temperatureCelsius * 1.8f + 32;
    }

    public void ChangeCelsiusTemperatureBy(float tempDiffCelsius){
        temperatureCelsius += tempDiffCelsius;
    }

    public void ChangeKelvinTemperatureBy(float tempDiffKelvin){
        temperatureCelsius = KelvinToCelsius(GetTemperatureInKelvin() + tempDiffKelvin);
    }

    public Element.AggregateState GetAggregateStateForElement(Element element){
        return element.GetAggregateState(this.temperatureCelsius);
    }

    private float KelvinToCelsius(float kelvin){
        return kelvin - 273.15f;
    }
}
