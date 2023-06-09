
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import
/**
 * Name: Humna Sultan
 * Program Name: 9.6 Animate
 * Date: 12 June 2019
 * Extra Thing: Ladybug moves in opposite direction from arrow
 */
public class Animate2 extends JPanel implements ActionListener
{
    //class name
    Timer time = new Timer(5, this);
    int x = 100, speed = 2;
    //sets time and x
    public void paintComponent(Graphics g)
    //method
    {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillOval(x, 90, 30, 30);
        g.setColor(Color.red);
        g.fillOval(x, 100, 60, 70);
        g.setColor(Color.black);
        g.fillOval(x, 120, 20, 20);
        g.fillOval(x+20, 140, 20, 20);
        g.fillOval(x+35, 110, 20, 20);
        //draws ladybug
        time.start();
        //starts time
    }
    public void actionPerformed(ActionEvent e)
    {
        x =x - speed;
        repaint();
        //moves ladybug
    }
    //time and action method

    public static void main (String[] args)
    //main method
    {
        Animate2 p = new Animate2();
        JFrame frm = new JFrame("Animate2");
        frm.add(new JLabel(new ImageIcon("p3.jpg")));
        frm.setSize (300,300);
        //sets size
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.add(p);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }

}
