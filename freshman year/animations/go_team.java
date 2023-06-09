
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GraphicsEnvironment;
//imports
/**
 * Name: Humna Sultan
 * Program Name: 9.1 Basics
 * Date: 28 May 2019
 * Extra Thing: N/A
 */
public class go_team extends JPanel {
    //class name
    public void paintComponent(Graphics g)
    //method
    {
        super.paintComponent(g);
        Font arial30 = new Font("Arial", Font.BOLD, 30);
        //creates new font for use with strings

        g.setColor(Color.blue);
        g.fillRect(0, 0, 400, 400);
        g.setColor(Color.orange);
        //fills background

        g.fillOval(100, 80, 35, 35);
        g.fillOval(100, 120, 35, 35);
        g.fillOval(100, 160, 35, 35);
        g.fillOval(100, 200, 35, 35);
        g.fillOval(140, 200, 35, 35);
        g.fillOval(180, 200, 35, 35);

        g.fillOval(220, 200, 35, 35);
        //draws circles on sides
        g.setFont(arial30);
        //sets font
        g.drawString("Go", 170, 120 );
        g.drawString("Team!", 150, 160 );
        //prints words
    }
    public static void main(String[] args)
    //main method
    {
        go_team d = new go_team();
        JFrame f = new JFrame ("Text");
        f.add(d);
        f.setSize(400,400);
        //sets size
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
