public class Start {
    public static void main(String[] args) {
        Sotrudnik s = new Sotrudnik();
        s.print();
        s.sortByIncome();
        System.out.println("После сортировки по зарплате");
        s.print();
        System.out.println("После сортировки по имени");
        s.sortByName();
        s.print();
        }

    }

