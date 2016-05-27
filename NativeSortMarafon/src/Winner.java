import java.util.Arrays;

public class Winner {


    public static Student[] selectionSort(Student[] arr) {
        Student[] students = arr.clone();

        double[] temp = new double[students.length];
        for (int i = 0; i < students.length; i++)
            temp[i] = students[i].getResult();
        Arrays.sort(temp);
        for (int i = 0; i < students.length; i++)
            for (int j = i + 1; j < students.length; j++){
                if (temp[i] == (students[j].getResult())){
                    Student s;
                    s = students[i];
                    students[i] = students[j];
                    students[j] = s;
                }
            }
        return students;
    }


    public static Student winner(Student[] arr){
        double res = 0;
        Student st = new Student();
        if (arr != null){
            st.setName(arr[0].getName());
            st.setLastName(arr[0].getLastName());
            st.setResult(arr[0].getResult());
        }

        for (int i = 1; i < arr.length; i++){
            if (arr[i].getResult() < st.getResult()){
                st.setName(arr[i].getName());
                st.setLastName(arr[i].getLastName());
                st.setResult(arr[i].getResult());
            }
        }
    return st;
    }

    public static void winnerThird(Student[] arr){
        Student[] mas = selectionSort(arr);
        System.out.println(mas[0].getName() + " " + mas[0].getLastName() + " " + mas[0].getResult());
        System.out.println(mas[1].getName() + " " + mas[1].getLastName() + " " + mas[1].getResult());
        System.out.println(mas[2].getName() + " " + mas[2].getLastName() + " " + mas[2].getResult());
    }

    public static double[] data(Student[] arr){
        double[] res = new double[2];
        double time;
        double t = 0;
        for (int i = 0; i < arr.length; i++){
            t+=arr[i].getResult();
        }
        time = t/arr.length;
        res[0] = time;
        res[1] = arr.length;
        return res;
    }

    public static void main(String[] args)
    {
        Student[]results=new Student[10];

        results[0]=new Student("Ivan","Ivanov");
        results[1]=new Student("Nikita","Kolyanov");
        results[2]=new Student("Nikita","Kolyanov");
        results[3]=new Student("Ramzes","Pharaonov");
        results[4]=new Student("John","Sina");
        results[5]=new Student("Usaim","Bolt");
        results[6]=new Student("Ivan","Gopotei");
        results[7]=new Student("Andrey","Arsenuev");
        results[8]=new Student("Radmir","Husnutdinov");
        results[9]=new Student("Konstantin","Hohlov");

        // Отсортированный массив
        Student[] students = selectionSort(results);
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].getResult());
        }

        System.out.println("Лучший результат:");
        Student st = winner(results);
        System.out.println(st.getName() + " " + st.getLastName() + " " + st.getResult());

        System.out.println("Тройка призеров");
        winnerThird(results);

        System.out.println("Среднее время:");
        double[] data = data(results);
        System.out.println(data[0]);
        System.out.println("Количество участников:");
        System.out.println(data[1]);
    }

}
