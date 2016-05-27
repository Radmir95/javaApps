
public class SquareOfRectangle {

    double height;
    double width;

    public SquareOfRectangle(){}

    public SquareOfRectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double square () throws SquareOfRectangleException{
        if (height <= 0 || width <= 0) throw new SquareOfRectangleException("Длина и ширина должны быть положительными", height, width);
        return height*width;
    }

}
