package dz_risovanie_1_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFrame extends JFrame implements ActionListener {
    JPanel cardPanel = new JPanel();
    JButton prev = new JButton("Day");
    JButton next = new JButton("Night");
    JPanel buttons = new JPanel();

    public SimpleFrame() {

        cardPanel.setLayout(new CardLayout(10, 10));
        cardPanel.add(new DrawComponent());
        cardPanel.add(new DrawComponentNight());
        setSize(650, 650);
        setTitle("SimpleFrame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        buttons.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        buttons.add(prev);
        prev.addActionListener(this);
        buttons.add(next);
        next.addActionListener(this);
        getContentPane().add("Center", cardPanel);
        getContentPane().add("East", buttons);
        setBounds(0, 0, 800, 650);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prev) {
            ((CardLayout) cardPanel.getLayout()).first(cardPanel);
        }
        if (e.getSource() == next) {
            ((CardLayout) cardPanel.getLayout()).last(cardPanel);
        }

    }


}
