package to090316;

public class Work3 {
    private int chisl[];
    private int znamen[];

    public Work3(int[] chisl, int[] znamen) {
        this.chisl = chisl;
        this.znamen = znamen;
    }

    public double method(){
        int tChisl = chisl[0];
        int tZnamen = znamen[0];
        for (int i = 1; i < chisl.length; i++){
            tChisl = znamen[i]*tChisl + tZnamen*chisl[i];
            tZnamen = tZnamen * znamen[i];
        }
        return (double)tChisl/tZnamen;
    }

}
