
public class SquareOfRectangleException extends Exception{

    private double number1;
    private double number2;
    public double getNumber1(){return number1;}
    public double getNumber2(){return number2;}
    public SquareOfRectangleException(String message, double num1, double num2){
        super(message);
        number1 = num1;
        number2 = num2;
    }

}
