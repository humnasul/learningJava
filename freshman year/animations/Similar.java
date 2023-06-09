
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//imports
/**
 * Name: Humna Sultan
 * Program Name: 9.1 Basics
 * Date: 28 May 2019
 * Extra Thing: N/A
 */
public class Similar extends JPanel {
    //class name
    public void paintComponent(Graphics g)
    //method
    {
        super.paintComponent(g);
        g.setColor(Color.cyan);
        g.fillRect(25,25, 100, 300);
        g.setColor(Color.black);
        g.drawRect(25, 25, 100, 300);
        //draws rectangle
        g.setColor(Color.pink);
        g.fillRect(25,25 , 10, 30);
        g.setColor(Color.black);
        g.drawRect(25, 25, 100, 300);
        //draws rectangle
        System.out.println("These rectangles are similar in that the lengths and widths are in a 10:1 ratio!");

        g.setColor(Color.cyan);
        g.fillRect(200,200 , 150, 150);
        g.setColor(Color.black);
        g.drawRect(200, 200, 150, 150);
        //draws square
        g.setColor(Color.pink);
        g.fillRect(200,200 , 75, 75);
        g.setColor(Color.black);
        g.drawRect(200, 200, 75, 75);
        //draws square
        System.out.println("These squares are similar in that the lengths and widths are in a 2:1 ratio!");

        g.setColor(Color.cyan);
        g.fillOval(150,50 , 100, 100);
        g.setColor(Color.black);
        g.drawOval(150, 50, 100, 100);
        //draws circle
        g.setColor(Color.pink);
        g.fillOval(150, 50 , 25, 25);
        g.setColor(Color.black);
        g.drawOval(150, 50, 25,25);
        //draws circle
        System.out.println("These circles are similar in that the radii are in a 4:1 ratio!");
    }
    public static void main(String[] args)
    //main method
    {
        Similar d = new Similar();
        JFrame f = new JFrame ("Similar");
        f.add(d);

        f.setSize(400,400);
        //sets size
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
