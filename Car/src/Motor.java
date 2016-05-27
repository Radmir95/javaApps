
public class Motor {
    private  int numOfCylinder;
    private double Volume;

    public Motor(int numOfCylinder, double volume) {
        this.numOfCylinder = numOfCylinder;
        Volume = volume;
    }

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double volume) {
        Volume = volume;
    }

    public int getNumOfCylinder() {
        return numOfCylinder;
    }

    public void setNumOfCylinder(int numOfCylinder) {
        this.numOfCylinder = numOfCylinder;
    }
}
