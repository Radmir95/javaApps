
public class Type { // лента

    Node zeroIndex;
    Node current;// текущий элемент

    enum A {// перечисления для множества A
        L, Phi, Ksi
    }

    public class Node{// класс узла для двухсвязного списка
        int index;  // номер в бесконечной ленте
        A cell; // значение, которое записано
        Node right; // правый элемент ленты
        Node left; // левый элемент ленты
    };

    Type(){ // начальное состояние ленты
        Node n = new Node();// создание нулевого элемента ленты
        n.index = 0;
        n.cell = A.L;
        n.left = null;
        n.right = null;
        zeroIndex = n;
        current = n; // узел в котором мы находимся в текущий такт(момент времени)
    }

    public void moveLeft(){     // движение влево
        if (current.left == null){
            Node n = new Node();
            current.left = n;
            n.index = current.index - 1;
            n.right = current;
            n.left = null;
            n.cell = A.L;
            current = n;
        }
        else{
            current = current.left;
        }
    }

    public void moveRight(){        // движение вправо
        if (current.right == null){
            Node n = new Node();
            current.right = n;
            n.index = current.index + 1;
            n.left = current;
            n.right = null;
            n.cell = A.L;
            current = n;
        }
        else{
            current = current.right;
        }
    }

    public A getCurrentData(){
        return current.cell;
    }

    public void writeData(A data){
        current.cell = data;
    }

    public void printType(){    // распечатка работы программы
        Node k = current;

        while (k.left != null){
            k = k.left;
        }

        while (k.right != null) {

            System.out.println(k.cell);
            k = k.right;
        }

    }

    public int countCells(){// подсчет количества использованных ячеек ленты
        Node k = current;
        int count = 0;
        while (k.left != null){
            k = k.left;
        }

        while (k.right != null) {

            count++;
            k = k.right;
        }
        return count;
    }

    public int countOfNonEmptyCells(){// подчет не нулевых ячеек ленты
        Node k = current;
        int count = 0;
        while (k.left != null){
            k = k.left;
        }

        while (k.right != null) {
            if (k.cell != A.L)
            count++;
            k = k.right;
        }
        return count;
    }



}
