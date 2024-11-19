package ch.hslu.oop.sw06;

import ch.hslu.oop.sw05.AggregateState;

public abstract class Element {
    Element(float meltingPointCelsius, float boilingPointCelsius, String name, String abbreviation) {
        this.elementName = name;
        this.elementAbbreviation = abbreviation;
        this.meltingPointCelsius = meltingPointCelsius;
        this.boilingPointCelsius = boilingPointCelsius;
    }

    private final String elementName;
    private final String elementAbbreviation;
    private final float meltingPointCelsius;
    private final float boilingPointCelsius;

    public String getElementName() {
        return elementName;
    }

    public String getElementAbbreviation() {
        return elementAbbreviation;
    }

    public AggregateState getAggregateState(float temp) {
        if (temp > this.boilingPointCelsius){
            return AggregateState.Gas;
        } else if (temp > this.meltingPointCelsius){
            return AggregateState.Liquid;
        } else {
            return AggregateState.Solid;
        }
    }

    @Override
    public String toString() {
        return "Element " + this.elementName + " with abbreviation " + this.elementAbbreviation;
    }
}
