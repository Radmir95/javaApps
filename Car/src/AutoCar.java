
public class AutoCar {

    private Door door;
    private Motor motor;
    private Wheel wheel;

    public AutoCar(Door door, Motor motor, Wheel wheel) {
        this.door = door;
        this.motor = motor;
        this.wheel = wheel;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void signal(){
        System.out.println("BEEEEP!!");
    }
    public void start(){
        System.out.println("Poehali");
    }
    public void finish(){
        System.out.println("Priehali");
    }
    public void boost(){
        System.out.println("Uskarenie na" + Math.random()*30 );
    }
    public void braking(){
        System.out.println("Zamedlenie");
    }

}
