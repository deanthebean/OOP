package ch.hslu.oop.sw08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TemperaturVerlauf {
    private List<Temperature> temperatures;

    public TemperaturVerlauf() {
        this.temperatures = new ArrayList<>();
    }

    public List<Temperature> getTemperatures() {
        return temperatures;
    }

    public void add(Temperature temperature) {
        temperatures.add(temperature);
    }

    public void clear(){
        temperatures.clear();
    }

    public int getCount(){
        return temperatures.size();
    }

    public float getMaxTemperature(){
        float max = Float.MIN_VALUE;
        for(Temperature temperature : temperatures){
            if(temperature.getTemperatureCelsius() > max){
                max = temperature.getTemperatureCelsius();
            }
        }
        return max;
    }

    public float getMinTemperature(){
        float min = Float.MAX_VALUE;
        for(Temperature temperature : temperatures){
            if(temperature.getTemperatureCelsius() < min){
                min = temperature.getTemperatureCelsius();
            }
        }
        return min;
    }

    public float getAverageTemperature(){
        if(getCount() == 0){
            return Float.MAX_VALUE;
        }
        float sum = 0;
        Iterator<Temperature> iterator = temperatures.iterator();
        while (iterator.hasNext()){
            Temperature temperature = iterator.next();
            sum += temperature.getTemperatureCelsius();
        }
        return sum / temperatures.size();
    }
}
