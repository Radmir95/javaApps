import javax.swing.*;

public class JFrameApp extends javax.swing.JFrame {
    public JFrameApp(){
        setBounds(100,100,700,350);
        setTitle("Форма для рисования");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new JPanelApp());
        setVisible(true);
    }

}
