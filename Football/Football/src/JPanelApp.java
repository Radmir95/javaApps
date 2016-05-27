import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class JPanelApp extends JPanel {

    public JPanelApp() {

        Data.fPlayers = new File("player.txt");
        Data.fClubs = new File("club.txt");
        Data.fBelongToClub = new File("belongToClub.txt");
        FileStream fileStream = new FileStream(Data.fPlayers);
        Data.players = fileStream.readFromFile();

        fileStream.setF(Data.fClubs);
        Data.clubs = fileStream.readFromFile();
        fileStream.setF(Data.fBelongToClub);
        Data.belongToClub = fileStream.readFromFile();


        this.setLayout(null);

        Object[][] data = new Object[Data.players.size()+1][7];
        Object[][] data1 = new Object[Data.clubs.size()+1][7];
        Object[][] data2 = new Object[Data.belongToClub.size()+1][6];

        data1[0][0] = "name_club";
        data1[0][1] = "id_club";
        data1[0][2] = "osnovaniyaDate";
        data1[0][3] = "budjet";
        data1[0][4] = "gorod";
        data1[0][5] = "numberOfSeats";
        data1[0][6] = "numberOfPlayers";

        data[0][0] = "familya";
        data[0][1] = "name";
        data[0][2] = "otchestvo";
        data[0][3] = "id_player";
        data[0][4] = "state";
        data[0][5] = "bornDate";
        data[0][6] = "inSbornaya";


        data2[0][0] = "id_player";
        data2[0][1] = "id_club";
        data2[0][2] = "durationOfContract";
        data2[0][3] = "startContractDate";
        data2[0][4] = "costOfContractForYear";
        data2[0][5] = "allCost";



        for (int i = 1; i < Data.players.size()+1; i++){
            String temp = Data.players.get(i-1);

            String pattern = "\\s+";

            String[] splitResult = temp.split(pattern);

            data[i][0] = splitResult[0];
            data[i][1] = splitResult[1];
            data[i][2] = splitResult[2];
            data[i][3] = splitResult[3];
            data[i][4] = splitResult[4];
            data[i][5] = splitResult[5];
            data[i][6] = splitResult[6];
        }

        for (int i = 1; i < Data.clubs.size()+1; i++){
            String temp = Data.clubs.get(i-1);

            String pattern = "\\s+";

            String[] splitResult = temp.split(pattern);

            data1[i][0] = splitResult[0];
            data1[i][1] = splitResult[1];
            data1[i][2] = splitResult[2];
            data1[i][3] = splitResult[3];
            data1[i][4] = splitResult[4];
            data1[i][5] = splitResult[5];
            data1[i][6] = splitResult[6];
        }

        for (int i = 1; i < Data.belongToClub.size()+1; i++){
            String temp = Data.belongToClub.get(i-1);

            String pattern = "\\s+";

            String[] splitResult = temp.split(pattern);

            data2[i][0] = splitResult[0];
            data2[i][1] = splitResult[1];
            data2[i][2] = splitResult[2];
            data2[i][3] = splitResult[3];
            data2[i][4] = splitResult[4];
            data2[i][5] = Integer.parseInt(splitResult[2]) * Integer.parseInt(splitResult[4]);

        }

        String[] tblheader = { "familya", "name", "otchestvo", "id_player", "state", "bornDate", "inSbornaya"};
        String[] tblheader1 = { "name_club", "id_club", "osnovaniyaDate", "budjet", "gorod", "numberOfSeats", "numberOfPlayers"};
        String[] tblheader2 = {"id_player", "id_club", "durationOfContract", "startContractDate", "costOfContractForYear", "allCost"};

        Data.tPlayers = new JTable(data, tblheader);
        Data.tClubs = new JTable(data1, tblheader1);
        Data.tBelongToClub = new JTable(data2,tblheader2);


        ScrollPane panelLeft = new ScrollPane();
        ScrollPane panelCenter = new ScrollPane();
        ScrollPane panelRight = new ScrollPane();

        panelLeft.add(Data.tPlayers);
        panelCenter.add(Data.tClubs);
        panelRight.add(Data.tBelongToClub);

        JButton bAddLeft = new JButton("+");
        JButton bAddCenter = new JButton("+");
        JButton bAddRight = new JButton("+");

        JButton bDeleteLeft = new JButton("-");
        JButton bDeleteCenter = new JButton("-");
        JButton bDeleteRight = new JButton("-");

        //JButton bSwapLeft = new JButton("*");
        //JButton bSwapCenter = new JButton("*");
        //JButton bSwapRight = new JButton("*");

        JLabel labelLeft = new JLabel("player");
        JLabel labelCenter = new JLabel("club");
        JLabel labelRight = new JLabel("belongToClub");

        labelLeft.setBounds(70,10, 70,20);
        labelCenter.setBounds(520,10, 70,20);
        labelRight.setBounds(970,10, 120,20);

        panelLeft.setBounds(5,50,200,200);
        panelCenter.setBounds(450,50,200,200);
        panelRight.setBounds(910,50,200,200);

        add(panelLeft);
        add(panelCenter);
        add(panelRight);

        add(labelLeft);
        add(labelCenter);
        add(labelRight);

        bAddLeft.setBounds(5,300, 60,30);
        //bSwapLeft.setBounds(70,300, 60,30);
        bDeleteLeft.setBounds(135,300, 60,30);

        bAddCenter.setBounds(455,300, 60,30);
       // bSwapCenter.setBounds(520,300, 60,30);
        bDeleteCenter.setBounds(585,300, 60,30);

        bAddRight.setBounds(905,300, 60,30);
       // bSwapRight.setBounds(970,300, 60,30);
        bDeleteRight.setBounds(1035,300, 60,30);

        add(bAddLeft);
        add(bAddCenter);
        add(bAddRight);

        add(bDeleteLeft);
        add(bDeleteCenter);
        add(bDeleteRight);

        //add(bSwapLeft);
        //add(bSwapCenter);
        //add(bSwapRight);

        bAddLeft.addActionListener(new ActionListener()
        {
                @Override
                public void actionPerformed(ActionEvent arg1){

                    String familya = JOptionPane.showInputDialog("familya");
                    String name = JOptionPane.showInputDialog("name");
                    String otchetvo = JOptionPane.showInputDialog("otchestvo");
                    String id_player = JOptionPane.showInputDialog("id_player");
                    String state = JOptionPane.showInputDialog("state");
                    String bornDate = JOptionPane.showInputDialog("bornDate");
                    String inSbornaya = JOptionPane.showInputDialog("inSbornaya");

                    String k = familya + " " + name + " " + otchetvo + " " + id_player + " " + state + " " + bornDate + " " + inSbornaya;

                    FileStream f = new FileStream(Data.fPlayers);

                    Data.tempPlayer.add(k);

                    updateUI();



                }
            });



        bAddCenter.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1){

                String familya = JOptionPane.showInputDialog("name_club");
                String name = JOptionPane.showInputDialog("id_club");
                String otchetvo = JOptionPane.showInputDialog("osnovaniyaDate");
                String id_player = JOptionPane.showInputDialog("budjet");
                String state = JOptionPane.showInputDialog("gorod");
                String bornDate = JOptionPane.showInputDialog("numberOfSeats");
                String inSbornaya = JOptionPane.showInputDialog("numberOfPlayers");

                String k = familya + " " + name + " " + otchetvo + " " + id_player + " " + state + " " + bornDate + " " + inSbornaya;

                FileStream f = new FileStream(Data.fPlayers);

                Data.tempClubs.add(k);

                updateUI();
            }
        });



        bAddRight.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1){
                String familya = JOptionPane.showInputDialog("id_player");
                String name = JOptionPane.showInputDialog("id_club");
                String otchetvo = JOptionPane.showInputDialog("durationOfContract");
                String id_player = JOptionPane.showInputDialog("startContractDate");
                String state = JOptionPane.showInputDialog("costOfContractForYear");
                String bornDate = JOptionPane.showInputDialog("allCost");

                String k = familya + " " + name + " " + otchetvo + " " + id_player + " " + state + " " + bornDate;

                FileStream f = new FileStream(Data.fPlayers);

                Data.tempBelongToClub.add(k);

                updateUI();
            }
        });


        }

    public static ArrayList<String> getPlayers(){



        return null;
    }
}

