
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
public class Animate extends JPanel implements ActionListener
{
    //class name
    Timer time = new Timer(5, this);
    int x = 20, speed = 2;
    //sets time and x
    public void paintComponent(Graphics g)
    //method
    {
        super.paintComponent(g);
        g.setColor(Color.cyan);
        int[] a = {x, x+60, x+60, x+80, x+60, x+60, x};
        int[] b = {40, 40, 20, 60, 100, 80, 80};
        g.fillPolygon(a, b, 7);

        //draws shape with formula in terms of x
        time.start();
        //starts time
    }

    public void actionPerformed(ActionEvent e)
    {
        if (x > 0 && x < 450)
        {
            x =x + speed;
            repaint();
        }
    }
    //time and action method
    public static void main (String[] args)
    //main method

    {
        Animate p = new Animate();
        JFrame frm = new JFrame("Animate");
        frm.setSize (300,300);
        //sets size
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.add(p);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }
}
