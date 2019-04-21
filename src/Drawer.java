import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import java.awt.geom.*;

public class Drawer extends JComponent{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.blue);
        Rectangle box = new Rectangle(200,200,100,100);
        g2.draw(box);
        box.translate(10,10);
        g2.fill(box);
        Ellipse2D.Double ellipse = new Ellipse2D.Double(2.2, 3.3, 40.5, 30.3);
        g2.draw(ellipse);
        g2.setColor(Color.black);
        g2.fill(ellipse);
        Line2D.Double segment = new Line2D.Double(39.3, 23.4, 232.3, 232.4);
        Point2D.Double from = new Point2D.Double (330.2, 220.3);
        Point2D.Double to = new Point2D.Double (4,3);
        Line2D.Double segment2 = new Line2D.Double (from, to);
        g2.draw(segment);
        g2.fill(segment2);
        g2.drawString("The Marvelous Merge Sort", 50, 50);


    }
}
