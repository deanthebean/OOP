package ch.hslu.oop.sw05;

import ch.hslu.oop.sw04.Switchable;

public class Light implements CountingSwitchable {
    private SwitchState switchState;
    private long switchCounter;

    public Light() {
        switchState = SwitchState.Off;
        this.switchCounter = 0;
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

    public void printMotorState(){
        System.out.println("Light is currently switched " + (isSwitchedOn() ? "on" : "off"));
    }
}
