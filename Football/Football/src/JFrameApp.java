import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class JFrameApp extends JFrame {
    public JFrameApp(){
        setBounds(100,100,1200,400);
        setTitle("Футбольчик");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new JPanelApp());

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

                ArrayList<String> players = new ArrayList<String>();
                ArrayList<String> club = new ArrayList<String>();
                ArrayList<String> belongToClub = new ArrayList<String>();

                for (int i = 1; i < Data.tPlayers.getRowCount(); i++){
                    String k = "";
                    for (int j = 0; j < Data.tPlayers.getColumnCount(); j++){
                        k+= Data.tPlayers.getValueAt(i,j) + " ";

                    }

                    players.add(k);
                }

                for (int i = 1; i < Data.tClubs.getRowCount(); i++){
                    String k = "";
                    for (int j = 0; j < Data.tClubs.getColumnCount(); j++){
                        k+= Data.tClubs.getValueAt(i,j) + " ";

                    }

                    club.add(k);
                }



                for (int i = 1; i < Data.tBelongToClub.getRowCount(); i++){
                    String k = "";
                    for (int j = 0; j < Data.tBelongToClub.getColumnCount(); j++){
                        k+= Data.tBelongToClub.getValueAt(i,j) + " ";

                    }

                    belongToClub.add(k);
                }

                for (int i = 0; i < Data.tempPlayer.size(); i++){
                    players.add(Data.tempPlayer.get(i));

                }

                for (int i = 0; i < Data.tempClubs.size(); i++){
                    club.add(Data.tempClubs.get(i));

                }

                for (int i = 0; i < Data.tempBelongToClub.size(); i++){
                    belongToClub.add(Data.tempBelongToClub.get(i));

                }


                FileStream f = new FileStream(Data.fClubs);
                f.reWrite("club.txt", club);
                f.reWrite("player.txt", players);
                f.reWrite("belongToClub.txt", belongToClub);



            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        setVisible(true);
    }

}
