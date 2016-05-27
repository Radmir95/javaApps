class Student extends Person {
    private String group;

    public Student(String surname, String name, String last_name, int age, String group) {
        super(surname, name, last_name, age);
        this.group = group;
    }

    @Override
    public String toString() {
        return super.fio() + " студент (группа:" + group + ")";
    }
}
