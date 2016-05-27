import java.util.Date;

public class club {
    String name_club;
    int id_club;
    Date osnovaniyaDate;
    int budjet;
    String gorod;
    int numberOfSeats;
    int numberOfPlayers;

    public club(String name_club, int id_club, Date osnovaniyaDate, int budjet, String gorod, int numberOfSeats, int numberOfPlayers) {
        this.name_club = name_club;
        this.id_club = id_club;
        this.osnovaniyaDate = osnovaniyaDate;
        this.budjet = budjet;
        this.gorod = gorod;
        this.numberOfSeats = numberOfSeats;
        //this.numberOfPlayers = numberOfPlayers; изменить эту строчку
    }

    public String getName_club() {
        return name_club;
    }

    public void setName_club(String name_club) {
        this.name_club = name_club;
    }

    public int getId_club() {
        return id_club;
    }

    public void setId_club(int id_club) {
        this.id_club = id_club;
    }

    public Date getOsnovaniyaDate() {
        return osnovaniyaDate;
    }

    public void setOsnovaniyaDate(Date osnovaniyaDate) {
        this.osnovaniyaDate = osnovaniyaDate;
    }

    public int getBudjet() {
        return budjet;
    }

    public void setBudjet(int budjet) {
        this.budjet = budjet;
    }

    public String getGorod() {
        return gorod;
    }

    public void setGorod(String gorod) {
        this.gorod = gorod;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
