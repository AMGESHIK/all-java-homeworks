package dz_risovanie_1_2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class DrawComponent1 extends JComponent {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        double leftX = 200;
        double topY = 100;
        double width = 200;
        double height = 200;
        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rect);
        g2.draw(new Rectangle2D.Double(leftX+15, topY+15, width - 30, height - 30));
        g2.draw(new Line2D.Double(leftX+width/2, topY, leftX+70, 30));
        g2.draw(new Line2D.Double(leftX+width/2, topY, leftX+130, 30));
        Ellipse2D smile = new Ellipse2D.Double(leftX+width/4, topY+height/4, width/2, height/2);
        g2.setColor(Color.YELLOW);
        g2.fill(smile);
        g2.draw(smile);
        g2.setColor(Color.BLACK);
        g2.draw(new Ellipse2D.Double(leftX+width/4+25, topY+height/4+30, 8, 8));
        g2.draw(new Ellipse2D.Double(leftX+width/4+67, topY+height/4+30, 8, 8));
        g2.fill(new Ellipse2D.Double(leftX+width/4+25, topY+height/4+30, 8, 8));
        g2.fill(new Ellipse2D.Double(leftX+width/4+67, topY+height/4+30, 8, 8));

        //g2.draw(new Ellipse2D.Double(leftX+width/3, topY+height/3, width/3, height/3));
        g2.drawArc((int)(leftX+width/3), (int)(topY+height/3), (int)(width/3), (int)(height/3), -40, (int)(-100));
    }

}
