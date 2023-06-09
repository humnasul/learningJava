
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//imports
/**
 * Name: Humna Sultan
 * Program Name: 9.3 Drawing
 * Date: 4 June 2019
 * Extra Thing: N/A
 */
public class housePic extends JPanel {
    //class name
    public void paintComponent(Graphics g)
    //method
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(100, 100, 150, 100);
        //draws rectangle
        g.setColor(Color.yellow);
        g.fillRect(125, 125, 20, 20);
        //draws rectangle

        g.setColor(Color.yellow);
        g.fillRect(195, 125, 20, 20);
        //draws rectangle
        g.setColor(Color.yellow);
        g.fillRect(160, 160, 25, 40);
        //draws rectangle
        g.setColor(Color.black);
        g.drawLine(100, 100, 150, 50);
        g.drawLine(150, 50, 250, 100);
    }
    public static void main(String[] args)
    //main method
    {
        housePic d = new housePic();
        JFrame f = new JFrame ("one");
        f.add(d);
        f.setSize(400,400);
        //sets size
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}