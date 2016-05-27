class Professor extends Person {
    private String kafedra;

    public Professor(String surname, String name, String last_name, int age, String department) {
        super(surname, name, last_name, age);
        this.kafedra = department;
    }

    @Override
    public String toString() {
        return super.fio() + " преподаватель (кафедра:" + kafedra + ")";
    }
}
