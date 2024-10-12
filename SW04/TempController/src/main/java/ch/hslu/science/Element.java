package ch.hslu.science;

/**
 * The {@code Element} class represents an element from the periodic table.
 */
public class Element {
    public Element(float meltingPointCelsius, float boilingPointCelsius) {
        this.meltingPointCelsius = meltingPointCelsius;
        this.boilingPointCelsius = boilingPointCelsius;
    }

    /**
     * The {@code AggregateState} enum represents the three aggregate states solid, liquid and gas
     */
    public enum AggregateState {
        Solid,
        Liquid,
        Gas
    }

    private final float meltingPointCelsius;
    private final float boilingPointCelsius;

    /**
     * Returns the elements aggregate state at a given temperature
     * @param temp
     *        The temperature at which the elements aggregate state is requested.
     * @return The elements aggregate state at a given temperature.
     *         Return is of type AggregateState enum
     */
    public AggregateState getAggregateState(float temp) {
        if (temp > this.boilingPointCelsius){
            return AggregateState.Gas;
        } else if (temp > this.meltingPointCelsius){
            return AggregateState.Liquid;
        } else {
            return AggregateState.Solid;
        }
    }
}
