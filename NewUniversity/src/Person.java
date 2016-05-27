class Person {

    private String surname;
    private String name;
    private String last_name;
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String surname, String name, String last_name, int age) {
        this.surname = surname;
        this.name= name;
        this.last_name = last_name;
        this.age = age;
    }

    public String fio(){
        return name + " " + surname.charAt(0) + "." + last_name.charAt(0) + ".";
    }

}