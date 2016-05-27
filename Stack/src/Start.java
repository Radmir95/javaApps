
public class Start {

    public static void main(String[] args) {
        Stack stack = new Stack();

        String string = "Строка";
        int iData = 273;
        double dData = 36.6;
        boolean bool = false;

        stack.push(string);
        stack.push(iData);
        stack.push(dData);
        stack.push(bool);

        System.out.println((boolean)stack.pop() + " " + (double)stack.pop());
        System.out.println((int)stack.pop() + " " + (String)stack.pop());

    }

}
