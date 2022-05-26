package dz_risovanie_1_1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class DrawComponentNight extends JComponent {

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        double leftX = 200;
        double topY = 100;
        double width = 200;
        double height = 300;
        Color initColor = g2.getColor();
        g2.setColor(new Color(255, 196, 194));
        g2.fillRect(0, 0, 650, 650);
        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
        g2.setColor(new Color(37, 40, 80));
        g2.fill(rect);
        g2.setColor(new Color(0));
        g2.draw(rect);
        g2.draw(new Line2D.Double(leftX + width / 2, topY, leftX + width / 2, topY + height));
        Polygon p = new Polygon();
        p.addPoint((int) (leftX + 85), (int) (topY + height));
        p.addPoint((int) (leftX + 70), (int) (topY + 260));
        p.addPoint((int) (leftX + 130), (int) (topY + 260));
        p.addPoint((int) (leftX + 115), (int) (topY + height));
        g2.setColor(Color.GRAY);
        g2.fill(p);
        g.drawPolygon(p);

        g2.setStroke(new BasicStroke(3));
        Line2D stebel = new Line2D.Double(leftX + width / 2, topY + 200, leftX + width / 2, topY + 258);
        g2.setColor(Color.GREEN);
        g2.draw(stebel);
        g2.fill(stebel);

        Ellipse2D ellipse1 = new Ellipse2D.Double(leftX + width / 2 - 15, topY + 200 - 15, 30, 30);
        g2.setColor(Color.RED);
        g2.draw(ellipse1);
        g2.setColor(Color.RED);
        g2.fill(ellipse1);

        Ellipse2D ellipse2 = new Ellipse2D.Double(leftX + width - 60, topY + 60, 50, 50);
        g2.setColor(Color.YELLOW);
        g2.draw(ellipse2);
        g2.setColor(Color.YELLOW);
        g2.fill(ellipse2);

        Ellipse2D ellipse3 = new Ellipse2D.Double(leftX + width - 65, topY + 58, 48, 48);
        g2.setColor(new Color(37, 40, 80));
        g2.draw(ellipse3);
        g2.setColor(new Color(37, 40, 80));
        g2.fill(ellipse3);

        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        JButton day = new JButton("Day");
        JButton night = new JButton("Night");
        buttons.add(day);
        buttons.add(night);


    }
}
