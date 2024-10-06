package ch.hslu.science;

public class Element {
    public Element(float meltingPointCelsius, float boilingPointCelsius) {
        this.meltingPointCelsius = meltingPointCelsius;
        this.boilingPointCelsius = boilingPointCelsius;
    }

    public enum AggregateState {
        Solid,
        Liquid,
        Gas
    }

    private final float meltingPointCelsius;
    private final float boilingPointCelsius;

    public AggregateState GetAggregateState(float temp) {
        if (temp > this.boilingPointCelsius){
            return AggregateState.Gas;
        } else if (temp > this.meltingPointCelsius){
            return AggregateState.Liquid;
        } else {
            return AggregateState.Solid;
        }
    }
}
