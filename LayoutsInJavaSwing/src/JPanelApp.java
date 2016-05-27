import javax.swing.*;
import javax.xml.bind.DatatypeConverter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class JPanelApp extends JPanel {

    public JPanelApp() {

        JButton border = new JButton("BorderLayout");
        JButton flow = new JButton("FlowLayout");
        JButton grid = new JButton("GridLayout");
        JButton box = new JButton("BoxLayout");
        JButton nullLayout = new JButton("NullLayout");

        add(border);
        add(flow);
        add(grid);
        add(box);
        add(nullLayout);


        border.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                setLayout(new BorderLayout());
                add(border,BorderLayout.CENTER);
                add(flow, BorderLayout.NORTH);
                add(grid, BorderLayout.SOUTH);
                add(box,BorderLayout.EAST);
                add(nullLayout,BorderLayout.WEST);
                updateUI();
            }});


        flow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                setLayout(new FlowLayout());
                add(border);
                add(flow);
                add(grid);
                add(box);
                add(nullLayout);
                updateUI();
            }});


        grid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                setLayout(new GridLayout());
                add(border);
                add(flow);
                add(grid);
                add(box);
                add(nullLayout);
                updateUI();
            }});

        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                setLayout(new BoxLayout(getRootPane(),BoxLayout.LINE_AXIS));
                add(border);
                add(flow);
                add(grid);
                add(box);
                add(nullLayout);
                updateUI();
            }});

        nullLayout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                setLayout(null);
                add(border);
                add(flow);
                add(grid);
                add(box);
                add(nullLayout);
                updateUI();
            }});
    }
}

