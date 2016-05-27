
public class Wheel {
    private boolean isStudded;
    private int diam;
    private String mark;

    public Wheel(boolean isStudded, int diam, String mark) {
        this.isStudded = isStudded;
        this.diam = diam;
        this.mark = mark;
    }

    public boolean isStudded() {
        return isStudded;
    }

    public void setStudded(boolean studded) {
        isStudded = studded;
    }

    public int getDiam() {
        return diam;
    }

    public void setDiam(int diam) {
        this.diam = diam;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
