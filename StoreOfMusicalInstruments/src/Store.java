
public class Store {

    public Store(String name, String address, String sellersName, Instrument[] instruments) {
        this.name = name;
        this.address = address;
        this.sellersName = sellersName;
        this.instruments = instruments;
    }

    //Поля
    private String name; //название магазина
    private String address; //адрес
    private String sellersName; // имя продавца
    private Instrument instruments[];//инструменты в продаже

    public void setInstruments(Instrument[] instruments){
        this.instruments = instruments;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSellersName() {
        return sellersName;
    }

    public Instrument[] getInstruments() {
        return instruments;
    }
}
