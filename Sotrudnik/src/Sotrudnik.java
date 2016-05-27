import java.util.Arrays;

public class Sotrudnik implements Comparable, Comparator {

    public Sotrudnik() {
        Sotrud s1 = new Sotrud("Максим Павлович", "менеджер", 20000);
        Sotrud s2 = new Sotrud("Андрей Павлович", "юрист", 35000);
        Sotrud s3 = new Sotrud("Алексей Савельевич", "кассир", 27000);
        Sotrud s4 = new Sotrud("Юрий Антипович", "бизнесмен", 89000);
        Sotrud s5 = new Sotrud("Анна Петрова", "программист", 90000);
        Sotrud s6 = new Sotrud("Арсений Вагизович", "консультант", 33000);
        office = new Sotrud[6];
        office[0] = s1;
        office[1] = s2;
        office[2] = s3;
        office[3] = s4;
        office[4] = s5;
        office[5] = s6;
    }

    private Sotrud[] office;

    public Sotrud[] getOffice() {
        return office;
    }

    private class Sotrud {
        private String name;
        private String position;
        private double income;


        public Sotrud(String name, String position, double income) {
            this.name = name;
            this.position = position;
            this.income = income;
        }

    }

    public void print(){
        for(int i = 0; i < office.length; i++)
            System.out.println(office[i].name + " " + office[i].position + " " + office[i].income);

    }

    public void sortByIncome() {
        for (int i = 0; i < office.length; i++) {
            for (int j = i + 1; j < office.length; j++) {
                if (office[i].income < office[j].income) {
                    Sotrud s = new Sotrud("Name", "Position", 20000);
                    s.name = office[i].name;
                    s.income = office[i].income;
                    s.position = office[i].position;
                    office[i] = office[j];
                    office[j] = s;
                }
            }
        }
    }


    public void sortByName() {
        String[] temp = new String[office.length];
        for (int i = 0; i < office.length; i++)
            temp[i] = office[i].name;
        Arrays.sort(temp);
        for (int i = 0; i < office.length; i++)
            for (int j = i + 1; j < office.length; j++){
                if (temp[i].equals(office[j].name)){
                    Sotrud s;
                    s = office[i];
                    office[i] = office[j];
                    office[j] = s;
                }
            }
    }
}