import javax.swing.*;

public class JFrameApp extends javax.swing.JFrame {
    public JFrameApp(){
        setBounds(100,100,400,500);
        setTitle("Кредитный калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new JPanelApp());
        setVisible(true);
    }

}
