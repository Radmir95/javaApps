
public class Client {

    public static void main(String[] args) {

        Instrument guitar1 = new Instrument("Бас гитара", "Pacifica012", "Россия",12489, "электрогитара c 6 струнами " +
                "тремоло-бридж Vintage Tremolo 22 лада, мензура 25.5 болченый гриф, корпус: агатис, гриф: клен, накладка: палисандр");

        Instrument guitar2 = new Instrument("Бас гитара", "Gibson Les Paul Studio","Швеция",130570, "электрогитара c 6 струнами " +
                "фиксированный бридж Tune-o-Matic /w Stopbar 22 лада, мензура 24.75 вклеенный гриф " +
                "корпус: красное дерево, топ: клен гриф: красное дерево, накладка: палисандр");

        Instrument saxaphone = new Instrument("Саксофон",
                "Yamaha YTS-26","Россия",120070, "Переработанная опора основания мундштука гарантирует" +
                "быструю реакцию и простоту исполнения, повышая вместе с тем прочность механизма." +
                " Усовершенствованный механизм соединения низких нот (си и до-диез) обеспечивает" +
                " равномерное закрытие нижней клавиши до-диез и четкую реакцию при извлечении нот в нижнем регистре инструмента.");

        Instrument flute = new Instrument("Флейта",
                "Yamaha YFL-371","Россия",80000, "Звук флейты в значительной степени определяет головка." +
                " Поэтому у предлагаемых по доступной цене флейт 300 серии головки сделаны из серебра 925 пробы," +
                " а корпус - из нейзильбера, что ощутимо улучшает характеристики инструмента.");
        Instrument[] instruments = {guitar1, guitar2,saxaphone,flute};

        Store worldOfJass = new Store("Мир музыки", "Ямашева 43", "Владимир Андреевич", instruments);


        System.out.println("Покупатель пришел в магазин под названием " + worldOfJass.getName());
        System.out.println("Магазин расположен по адресу " + worldOfJass.getAddress());
        System.out.println("Продавца зовут " + worldOfJass.getSellersName());
        System.out.println("Покупатель взял первый инструмент: " + worldOfJass.getInstruments()[0].getName());
        System.out.println("Продавец назвал модель инструмента " + worldOfJass.getInstruments()[0].getModel());
        System.out.println("Покупатель захотел сыграть на инструменте ");
        worldOfJass.getInstruments()[0].playMusic();
        System.out.println("Цена " + worldOfJass.getInstruments()[0].getCost());

        System.out.println("Покупатель взял третий инструмент: " + worldOfJass.getInstruments()[2].getName());
        System.out.println("Продавец назвал модель инструмента " + worldOfJass.getInstruments()[2].getModel());
        System.out.println("Покупатель захотел сыграть на инструменте ");
        worldOfJass.getInstruments()[2].playMusic();
        System.out.println("Цена " + worldOfJass.getInstruments()[2].getCost());
        System.out.println("Покупатель попросил дополнительную информацию об инструменте: " + worldOfJass.getInstruments()[2].getAddInformation());
    }
}
