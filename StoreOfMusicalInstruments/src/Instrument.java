
public class Instrument {

    //Конструктор по умолчанию
    public Instrument(String name, String model, String madeIn, double cost, String addInformation) {
        this.name = name;
        this.model = model;
        this.madeIn = madeIn;
        this.cost = cost;
        this.addInformation = addInformation;
    }
    //Поля
    private String name; // название инструмента
    private String model; // модель инструмента
    private String madeIn; // где сделан
    private double cost; // цена
    private String addInformation; // дополнительная информация

    //Играть на инструменте
    public void playMusic(){
        System.out.println("Играет музыка " + name + " " + model);
    }

    //Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getAddInformation() {
        return addInformation;
    }

    public void setAddInformation(String addInformation) {
        this.addInformation = addInformation;
    }


}
