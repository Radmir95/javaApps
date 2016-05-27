public class Citizen {
    private String fio;
    private int age;
    private String address;
    private int numOfMinorityChildren;
    private int debts;

    public Citizen(String fio, int age, String address, int numOfMinorityChildren, int debts) {
        this.fio = fio;
        this.age = age;
        this.address = address;
        this.numOfMinorityChildren = numOfMinorityChildren;
        this.debts = debts;
    }

    public int getDebts() {
        return debts;
    }

    public void setDebts(int debts) {
        this.debts = debts;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumOfMinorityChildren() {
        return numOfMinorityChildren;
    }

    public void setNumOfMinorityChildren(int numOfMinorityChildren) {
        this.numOfMinorityChildren = numOfMinorityChildren;
    }

}
