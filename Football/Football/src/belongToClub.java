import java.util.Date;

public class belongToClub {
    int id_player;
    int id_club;
    int durationOfContract;
    Date startContractDate;
    double costOfContractForYear;
    double allCost;

    public belongToClub(int id_player, int id_club, int durationOfContract, Date startContractDate, double costOfContractForYear) {
        this.id_player = id_player;
        this.id_club = id_club;
        this.durationOfContract = durationOfContract;
        this.startContractDate = startContractDate;
        this.costOfContractForYear = costOfContractForYear;
        this.allCost = this.countAllContractCost(costOfContractForYear,durationOfContract);
    }

    private static double countAllContractCost(double cost, int year){
        return cost*(double)year;
    }
}
