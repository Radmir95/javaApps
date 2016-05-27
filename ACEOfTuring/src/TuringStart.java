
public class TuringStart {
    public static int t;



    TuringStart(){
        t = 0;
    }// начальное задание такта

    public static void main(String[] args) {
        int counter = 0;
        int numOfDirectionChange = 0;// количество смены направления движения считывающей головки
        String curDirection = "Nothing";// текущее направление движения считывающей головки
        int[] isAllStatus = new int[6]; // во всех ли состояниях была машина тьюринга
        for (int i = 0; i < isAllStatus.length; i++)
            isAllStatus[i] = 0;


        MapOfWork map = new MapOfWork(); // создание класса для инструкций машины тьюринга
        map.create(); // заполение инструкций
        int status = 1; // начальное состояние М.Т.

        Type type = new Type(); // создание бесконечной ленты

        while (status != 0 && t != 60) { // пока не достигнуто стоп-состояние или количество тактов не равно 60
            if (type.current.cell == Type.A.Phi && status == 2) // пункт 'ж'
                counter++;
            Type.A curType = type.getCurrentData(); // получение символа из ленты


            int num = 0; // номер из множества А
            if (curType == Type.A.L) num = 0;
            else if (curType == Type.A.Phi) num = 1;
            else num = 2;

            type.current.cell = map.data[num][status - 1].a; // получение из программы нового состояния


            // пункт 'з'
            if (status != 0) {// проверка на стоп-состояние
                if (map.data[num][status - 1].direction == "right") { // движение вправо
                    if (curDirection != "right"){
                        curDirection = "right";
                        numOfDirectionChange++;
                    }
                    type.moveRight();
                } else if (map.data[num][status - 1].direction == "left") {
                    if (curDirection != "left"){
                        curDirection = "left";
                        numOfDirectionChange++;
                    }
                    type.moveLeft();

                }
                status = map.data[num][status - 1].q; // изменение текущего состояние М.Т.
                isAllStatus[status-1] = 1; //пункт 'д'
                t += 1;// увеличение такта

            }

        }
        type.printType();
        System.out.println("в. Количество ячеек:");
        System.out.println(type.countCells());
        System.out.println("г. Количество ячеек без пустого символа(машина завершила работу на 60 такте):");
        System.out.println(type.countOfNonEmptyCells());
        System.out.println("д. Окажется ли устройство в каждом из своих сосотояний ?");
        boolean isAll = true;
        for (int i = 0; i < isAllStatus.length && isAll; i++){
            if (isAllStatus[i] == 0)
                isAll = false;
        }
        System.out.println(isAll);
        System.out.println("ж. Сколько раз выбиралась клетка таблицы, соответствующая символу a1 и состоянию q2");
        System.out.println(counter);
        System.out.println("з. сколько поворотов совершило устройство");
        System.out.println(numOfDirectionChange);

    }

}
