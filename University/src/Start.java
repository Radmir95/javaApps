import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;


public class Start {


    public static ArrayList selectionSort(ArrayList arr) {
        ArrayList students = (ArrayList) arr.clone();

        String[] temp = new String[students.size()];
        for (int i = 0; i < students.size(); i++){
            Object s = students.get(i);
            Student ss = (Student) s;
            temp[i] = ss.getLast_name();
        }
        Arrays.sort(temp);
        for (int i = 0; i < students.size(); i++)
            for (int j = i + 1; j < students.size(); j++){
                Object s = students.get(j);
                Student ss = (Student) s;
                if (temp[i] == (ss.getLast_name())){
                    Student ns;
                    Object k = students.get(i);
                    ns = (Student)k;
                    students.set(i,students.get(j));
                    students.set(j,ns);
                }
            }
        return students;
    }

    public static ArrayList selectionSortTeacher(ArrayList arr) {
        ArrayList teachers = (ArrayList) arr.clone();

        String[] temp = new String[teachers.size()];
        for (int i = 0; i < teachers.size(); i++){
            Object s = teachers.get(i);
            Teacher ss = (Teacher) s;
            temp[i] = ss.getLast_name();
        }
        Arrays.sort(temp);
        for (int i = 0; i < teachers.size(); i++)
            for (int j = i + 1; j < teachers.size(); j++){
                Object s = teachers.get(j);
                Teacher ss = (Teacher) s;
                if (temp[i] == (ss.getLast_name())){
                    Teacher ns;
                    Object k = teachers.get(i);
                    ns = (Teacher) k;
                    teachers.set(i,teachers.get(j));
                    teachers.set(j,ns);
                }
            }
        return teachers;
    }

    public static void main(String[] args) {
        ArrayList persons = new ArrayList();

        Student student1 = new Student();
        student1.id = 3232;
        student1.first_name = "Андрей";
        student1.last_name = "Кашапов";
        student1.end_name = "Маратович";
        student1.setGroup("09-423");

        Student student2 = new Student();
        student2.id = 3132;
        student2.first_name = "Виктор";
        student2.last_name = "Кандрашев";
        student2.end_name = "Сарянов";
        student2.setGroup("09-413");

        Student student3 = new Student();
        student3.id = 32;
        student3.first_name = "Николай";
        student3.last_name = "Капралов";
        student3.end_name = "Александрович";
        student3.setGroup("09-423");

        Student student4 = new Student();
        student4.id = 3421;
        student4.first_name = "Петр";
        student4.last_name = "Лаишев";
        student4.end_name = "Дмитриевич";
        student4.setGroup("09-413");

        Student student5 = new Student();
        student5.id = 4213;
        student5.first_name = "Артем";
        student5.last_name = "Винокуров";
        student5.end_name = "Алмазович";
        student5.setGroup("09-415");

        Teacher teacher1 = new Teacher();
        teacher1.id = 12;
        teacher1.first_name = "Николай";
        teacher1.last_name = "Саляхов";
        teacher1.end_name = "Александрович";
        teacher1.setKafedra("Вычислительная математика и информатика");

        Teacher teacher2 = new Teacher();
        teacher2.id = 31;
        teacher2.first_name = "Дмитрий";
        teacher2.last_name = "Хасанов";
        teacher2.end_name = "Викторович";
        teacher2.setKafedra("Системный анализ");

        Teacher teacher3 = new Teacher();
        teacher3.id = 2;
        teacher3.first_name = "Алексей";
        teacher3.last_name = "Ганиев";
        teacher3.end_name = "Андреев";
        teacher3.setKafedra("Теоретическая кибернетика");

        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(student4);
        persons.add(student5);

        ArrayList k = selectionSort(persons);

        ArrayList t = new ArrayList();

        t.add(teacher1);
        t.add(teacher2);
        t.add(teacher3);

        ArrayList s = selectionSortTeacher(t);

        for(int i = 0; i < k.size(); i++){
            Object st = k.get(i);
            Student ss = (Student) st;
            System.out.println(((Student) st).getLast_name() + " " + ((Student) st).getFirst_name().charAt(0)+
                    "."+ ((Student) st).getEnd_name().charAt(0) + ". - студент(группа:" + ((Student) st).getGroup() + ")"
            );

        }

        for(int i = 0; i < s.size(); i++){
            Object sn = s.get(i);
            Teacher ss = (Teacher) sn;
            System.out.println(((Teacher) ss).getLast_name() + " " + ((Teacher) ss).getFirst_name().charAt(0)+
                    "."+ ((Teacher) ss).getEnd_name().charAt(0) + ". - преподаватель(кафедра:" + ss.getKafedra() + ")"
            );

        }

    }
}
