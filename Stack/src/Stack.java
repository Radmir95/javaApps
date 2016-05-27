public class Stack {

    // Поля
    private int length; // Длина массива
    private int currentNum; // Текущий элемент в стеке
    private Object[] data; // Стек

    // Конструктор по умолчанию
   public Stack() {
       this.length = 0;
       this.currentNum = 0;
       data = null;
    }

    // Добавить данные в стек
    public void push(Object value){
        length++;
        Object[] mas = new Object[length];

        if (length > 1)
            for (int i = 0; i < length-1; i++)
                mas[i] = data[i];
        mas[length-1] = value;
        currentNum = length-1;
        data = mas;
    }

    // Взять верхний элеменет стека
    public Object pop(){
        if (currentNum >= 0) {
            currentNum--;
            return data[currentNum + 1];
        }
        return null;
    }
}
