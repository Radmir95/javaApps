import java.util.Date;

/**
 * Created by dns on 12.05.2016.
 */


enum amplua{
    vratar,
    zashitik,
    poluzashitnik,
    napadayshii
}
public class player {
    String familya;
    String name;
    String otchestvo;
    int id_player;
    amplua state;
    Date bornDate;
    boolean inSbornaya;

    public player(String familya, String name, String otchestvo, amplua state, int id_player, Date bornDate, boolean inSbornaya) {
        this.familya = familya;
        this.name = name;
        this.otchestvo = otchestvo;
        this.state = state;
        this.id_player = id_player;
        this.bornDate = bornDate;
        this.inSbornaya = inSbornaya;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilya() {
        return familya;
    }

    public void setFamilya(String familya) {
        this.familya = familya;
    }

    public int getId_player() {
        return id_player;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public amplua getState() {
        return state;
    }

    public void setState(amplua state) {
        this.state = state;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public boolean isInSbornaya() {
        return inSbornaya;
    }

    public void setInSbornaya(boolean inSbornaya) {
        this.inSbornaya = inSbornaya;
    }

}
