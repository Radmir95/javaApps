public class TaxInspection {

    private static double taxLess3Children = 0.15;
    private static double taxForManyChildren = 0.10;
    private static Citizen citizens[];


    public static void main(String[] args) {
        Citizen citizen1 = new Citizen("Хасанов Андрей Викторович", 30, "Ямашева 13", 4, 11211);
        Citizen citizen2 = new Citizen("Савельев Андрей Дмитриевич", 34, "Фучика 1", 1, 13153);
        Citizen citizen3 = new Citizen("Юлдашев Андрей Тимурович", 22, "Красноармейская 12", 0, 6315);
        Citizen citizen4 = new Citizen("Халлева Юлия Викторовна", 37, " 13", 1, 15643);
        Citizen citizen5 = new Citizen("Шаляпин Андрей Константиновна", 24, "Ямашева 2", 5, 16435);
        Citizen citizen6 = new Citizen("Синдимиров Юрий Викторович", 45, "Комарова 2", 0, 16354);
        Citizen citizen7 = new Citizen("Синдимирова Анна Андреевна", 42, "Баумана 10", 2, 12543);
        citizens = new Citizen[30];
        citizens[0] = citizen1;
        citizens[1] = citizen2;
        citizens[2] = citizen3;
        citizens[3] = citizen4;
        citizens[4] = citizen5;
        citizens[5] = citizen6;
        citizens[6] = citizen7;

        System.out.print("Гражданин(ка) " + citizens[0].getFio()+ " имеет " + citizens[0].getNumOfMinorityChildren() +
                " несовершеннолетних детей, налог: ");
        if (citizens[0].getNumOfMinorityChildren() >= 3) System.out.println(citizens[0].getDebts()* taxForManyChildren);
        else
            System.out.println(citizens[0].getDebts()*taxLess3Children);

        System.out.print("Гражданин(ка) " + citizens[3].getFio()+ " имеет " + citizens[3].getNumOfMinorityChildren() +
                " несовершеннолетних детей, налог: ");
        if (citizens[3].getNumOfMinorityChildren() >= 3) System.out.println(citizens[3].getDebts() * taxForManyChildren);
        else
            System.out.println(citizens[3].getDebts()*taxLess3Children);

    }
}
