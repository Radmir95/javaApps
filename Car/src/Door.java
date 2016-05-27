
public class Door {
    private String color;
    private boolean tonirovka;

    public Door(String color, boolean tonirovka) {
        this.color = color;
        this.tonirovka = tonirovka;

    }


    public boolean isTonirovka() {
        return tonirovka;
    }

    public void setTonirovka(boolean tonirovka) {
        this.tonirovka = tonirovka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
