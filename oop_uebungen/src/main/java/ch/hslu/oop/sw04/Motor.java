package ch.hslu.oop.sw04;

public class Motor implements Switchable{
    private SwitchState switchState;
    private int rpm;

    public Motor() {
        switchState = SwitchState.Off;
        rpm = 0;
    }

    @Override
    public void switchOn(){
        if(switchState != SwitchState.On){
            switchState = SwitchState.On;
            rpm = 300;
        }
    }

    @Override
    public void switchOff(){
        if(switchState != SwitchState.Off){
            switchState = SwitchState.Off;
            rpm = 0;
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

    public int getRpm() {
        return rpm;
    }

    public void printMotorState(){
        System.out.println("Motor is currently switched " + (isSwitchedOn() ? "on" : "off") + " and at " + getRpm() + "rpm.");
    }
}
