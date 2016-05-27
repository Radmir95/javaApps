import java.util.Comparator;

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        boolean f = (person1.fio()).equals(person2.fio());
        if (f) return 1;
        else return 0;
    }
}
