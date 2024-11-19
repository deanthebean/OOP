package ch.hslu.oop.sw04;

public class Light implements Switchable{
    private SwitchState switchState;

    public Light() {
        switchState = SwitchState.Off;
    }

    @Override
    public void switchOn(){
        if(switchState != SwitchState.On){
            switchState = SwitchState.On;
        }
    }

    @Override
    public void switchOff(){
        if(switchState != SwitchState.Off){
            switchState = SwitchState.Off;
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

    public void printMotorState(){
        System.out.println("Light is currently switched " + (isSwitchedOn() ? "on" : "off"));
    }
}
