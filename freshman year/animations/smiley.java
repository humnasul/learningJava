
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
//imports
/**
 * Name: Humna Sultan
 * Program Name: 9.3 Drawing
 * Date: 4 June 2019
 * Extra Thing: Face looks like Ernie; printed heart
 */

public class smiley extends JPanel {
    //class name
    public void paintComponent(Graphics g)
    //method
    {
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillOval(40, 100, 300, 150);
        //face
        g.setColor(Color.black);
        g.fillOval(120, 130, 40, 30);
        g.fillOval(210, 130, 40, 30);
        //two eyes
        g.setColor(Color.red);
        g.fillOval(175, 130, 15, 60);
        //nose
        g.setColor(Color.magenta);
        g.fillArc(125, 190, 120, 35, 180, 180);
        //mouth

    }
    public static void main(String[] args)
    //main method
    {
        Scanner in = new Scanner(System.in);
        smiley d = new smiley();
        JFrame f = new JFrame ("three");
        f.add(d);
        f.setSize(400,400);
        //sets size
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        System.out.println(" ́ ́ ́ ́¶¶¶¶¶¶ ́ ́ ́ ́ ́ ́¶¶¶¶¶¶");
        System.out.println(" ́ ́¶¶¶¶¶¶¶¶¶¶ ́ ́¶¶¶¶¶¶¶¶¶¶");
        System.out.println(" ́¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ́ ́ ́ ́¶¶¶¶");
        System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ́ ́ ́ ́¶¶¶¶");
        System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ́ ́¶¶¶¶¶");
        System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶  ́¶¶¶¶¶ ́");
        System.out.println(" ́ ́¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
        System.out.println(" ́ ́ ́ ́ ́¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
        System.out.println(" ́ ́ ́ ́ ́ ́ ́¶¶¶¶¶¶¶¶¶¶¶¶¶");
        System.out.println(" ́ ́ ́ ́ ́ ́ ́ ́ ́¶¶¶¶¶¶¶¶");
        System.out.println(" ́ ́ ́ ́ ́ ́ ́ ́ ́ ́ ́¶¶¶¶");
        //printing heart
    }
}
