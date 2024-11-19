package ch.hslu.oop.sw05;

public abstract class Element implements CountingSwitchable{
    Element(float meltingPointCelsius, float boilingPointCelsius, String name, String abbreviation) {
        this.elementName = name;
        this.elementAbbreviation = abbreviation;
        this.meltingPointCelsius = meltingPointCelsius;
        this.boilingPointCelsius = boilingPointCelsius;
        this.switchCounter = 0;
        this.switchState = SwitchState.Off;
    }

    private final String elementName;
    private final String elementAbbreviation;
    private final float meltingPointCelsius;
    private final float boilingPointCelsius;
    private long switchCounter;
    private SwitchState switchState;

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
    public void switchOn(){
        if(switchState != SwitchState.On){
            switchState = SwitchState.On;
            switchCounter++;
        }
    }

    @Override
    public void switchOff(){
        if(switchState != SwitchState.Off){
            switchState = SwitchState.Off;
            switchCounter++;
        }
    }

    @Override
    public boolean isSwitchedOn(){
        return switchState == SwitchState.On;
    }

    @Override
    public boolean isSwitchedOff(){
        return switchState == SwitchState.Off;
    }

    @Override
    public long getSwitchCount(){
        return switchCounter;
    }
}
