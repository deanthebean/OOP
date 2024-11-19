package ch.hslu.oop.sw04;

public class Vehicle implements Switchable{
    private SwitchState switchState;
    Motor motor;
    Light light;

    public Vehicle() {
        switchState = SwitchState.Off;
        motor = new Motor();
        light = new Light();
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
        System.out.println("Vehicle is currently switched " + (isSwitchedOn() ? "on" : "off"));
    }
}
