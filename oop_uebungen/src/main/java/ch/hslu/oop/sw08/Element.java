package ch.hslu.oop.sw08;

import ch.hslu.oop.sw08.AggregateState;

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

    public final String getElementName() {
        return elementName;
    }

    public final String getElementAbbreviation() {
        return elementAbbreviation;
    }

    public final AggregateState getAggregateState(float temp) {
        if (temp > this.boilingPointCelsius){
            return AggregateState.GAS;
        } else if (temp > this.meltingPointCelsius){
            return AggregateState.LIQUID;
        } else {
            return AggregateState.SOLID;
        }
    }
}
