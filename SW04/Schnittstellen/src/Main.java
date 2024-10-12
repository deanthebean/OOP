public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.motor.printMotorState();
        vehicle.motor.switchOn();
        vehicle.motor.printMotorState();
        vehicle.motor.switchOff();
        vehicle.motor.printMotorState();
    }
}