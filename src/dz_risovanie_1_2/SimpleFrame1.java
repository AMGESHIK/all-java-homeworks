package dz_risovanie_1_2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;

public class SimpleFrame1 extends JFrame implements ActionListener, Serializable{
    private static final long serialVersionUID = 1L;
    JButton next = new JButton("channel");
    JPanel cardPanel = new JPanel();
    JPanel buttons = new JPanel();

    public SimpleFrame1(){
        cardPanel.setLayout(new CardLayout(10, 10));
        cardPanel.add(new DrawComponent1());
        cardPanel.add(new DrawComponentSad());
        setSize(650, 650);
        setTitle("SimpleFrame");
        DrawComponent1 c = new DrawComponent1();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        buttons.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        buttons.add(next);
        next.addActionListener(this);
        getContentPane().add("Center", cardPanel);
        getContentPane().add("East", buttons);
        setBounds(0, 0, 800, 650);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == next) {
            ((CardLayout) cardPanel.getLayout()).next(cardPanel);
        }

    }
}
