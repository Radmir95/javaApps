import javax.swing.*;
import javax.xml.bind.DatatypeConverter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelApp extends JPanel {


    public JPanelApp() {




        }


    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.drawRect(150, 110, 60, 60);
        g.fillRect(150,110,60,60);

        g.setColor(Color.GREEN);
        g.fillOval(300,110,60,60);
        g.drawOval(300, 110, 60, 60);

        int[] arrayX = {490, 420, 490};
        int[] arrayY = {110, 110, 160};
        g.setColor(Color.YELLOW);
        g.fillPolygon(arrayX,arrayY,3);
        Polygon poly = new Polygon(arrayX, arrayY, 3);
        g.drawPolygon(poly);

        g.setColor(Color.RED);

        g.drawLine(180,140,475,130);

    }

}

