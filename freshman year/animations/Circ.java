
import java.awt.*;
import javax.swing.*;
//import
/**
 * Name: Humna Sultan
 * Program Name: 9.5 Repeat
 * Date: 9 June 2019
 * Extra Thing: N/A
 */
public class Circ extends JPanel
{
    //class name
    public void paintComponent(Graphics g)
    //method
    {
        super.paintComponent(g);
        setBackground(Color.WHITE);
        int x = 50, y = 50, width = 100, height = 110;
        g.setColor(Color.black);
        for (int i = 1; i <= 7; i++)
        //for loop for drawing repetitive shapes
        {
            g.setColor(Color.black);
            g.drawOval(x, y, height, width);
            g.setColor(Color.yellow);
            g.fillOval(x, y, height, width);
            x = x + 20;
            width = (int) (width);
            height = (int) (height);
        }

        g.setColor(Color.blue);
        g.fillOval(185, 75, 35, 35);
        g.fillOval(235, 75, 35, 35);
        g.setColor(Color.red);
        g.fillOval(205, 117, 40, 20);
        //draws features on face
    }
    public static void main (String[] args)
    //main method
    {
        Circ p = new Circ();
        JFrame frm = new JFrame("Circ");
        frm.setSize (300,300);
        //sets size
        frm.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frm.add(p);
        frm.setVisible(true);
    }
}
