
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//imports
/**
 * Name: Humna Sultan
 * Program Name: 9.4 Drawing
 * Date: 4 June 2019
 * Extra Thing: Cool shape on other program
 */
public class dimenShape extends JPanel {
    //class name
    public void paintComponent(Graphics g)
    //method
    {
        super.paintComponent(g);
        g.setColor(Color.blue);
        //sets color
        g.drawLine(100, 100, 125, 200);
        g.drawLine(200, 100, 175, 200);
        //draws lines at sides
        g.drawOval(100, 90, 100, 20);
        g.drawOval(125, 195, 50, 10);
        //draws bases of conical frustum
    }
    public static void main(String[] args)
    //main method
    {
        dimenShape d = new dimenShape();
        JFrame f = new JFrame ("shape2");
        f.add(d);
        f.setSize(400,400);
        //sets size
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
