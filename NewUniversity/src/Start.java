import java.util.LinkedList;

public class Start {
    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<Person>();
        persons.add(new Student("Ханнанов", "Игорь", "Исрафилович", 19, "09-401"));
        persons.add(new Student("Иванов", "Дмитрий", "Петрович", 17, "09-421"));
        persons.add(new Student("Сабирзянов", "Юрий", "Иванович", 18, "09-421"));
        persons.add(new Student("Петров", "Петр", "Петрович", 19, "09-414"));
        persons.add(new Student("Степанов", "Иван", "Андреевич", 22, "09-421"));
        persons.add(new Professor("Ахметшина", "Элина", "Алексеевна", 50, "Прикладной математики и информатики"));
        persons.add(new Professor("Алекандров", "Александр", "Александрович", 61, "Приближения функций"));
        persons.add(new Professor("Иванова", "Аделина", "Фаизовна", 46, "Системного анализа и информационных технологий"));


        persons.sort(new NameComparator());
        for (int i = 0; i < persons.size(); i++)
            System.out.println(persons.get(i));
    }
}

