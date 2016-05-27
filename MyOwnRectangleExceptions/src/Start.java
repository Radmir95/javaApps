import javax.xml.bind.DatatypeConverter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int height = 0;
        int width = 0;

        try {
            System.out.println("Enter height of rectangle: ");
            height = DatatypeConverter.parseInt(reader.readLine());
            System.out.println("Enter width of rectangle: ");
            width = DatatypeConverter.parseInt(reader.readLine());
        }

        catch (IOException ex){
            System.out.println(ex.getMessage());
        }


        SquareOfRectangle squareOfRectangle = new SquareOfRectangle(height,width);

        try{
            System.out.println(squareOfRectangle.square());
        }
        catch (SquareOfRectangleException ex){
            System.out.println(ex.getMessage());
            System.out.println("Height = " + ex.getNumber1());
            System.out.println("Width = " + ex.getNumber2());
        }
    }
}
