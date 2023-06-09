
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//imports
/**
 * Name: Humna Sultan
 * Program Name: 9.4 Drawing
 * Date: 4 June 2019
 * Extra Thing: Other cool shape program
 */
public class draw_rec extends JPanel {
    //class name
    public void paintComponent(Graphics g)
    //method
    {
        super.paintComponent(g);
        int[] x1 = {250, 300, 300, 250};
        int[] y1 = {100, 50, 200, 250};
        g.setColor(Color.blue);
        g.drawPolygon(x1, y1, 4);
        g.setColor(Color.pink);
        g.fillPolygon(x1, y1, 4);
        //draws right shape
        int[] x2 = {100, 60, 250, 300};
        int[] y2 = {50, 100, 100, 50};

        g.setColor(Color.blue);
        g.drawPolygon(x2, y2, 4);
        g.setColor(Color.pink);
        g.fillPolygon(x2, y2, 4);
        //draws top
        int[] x3 = {60, 60, 100, 100};
        int[] y3 = {100, 250, 200, 100};
        g.setColor(Color.blue);
        g.drawPolygon(x3, y3, 4);
        g.setColor(Color.pink);
        g.fillPolygon(x3, y3, 4);
        //draws left
        int[] x4 = {60, 100, 250, 250};
        int[] y4 = {250, 200, 200, 250};
        g.setColor(Color.blue);
        g.drawPolygon(x4, y4, 4);
        g.setColor(Color.pink);
        g.fillPolygon(x4, y4, 4);
        //draws bottom
    }
    public static void main(String[] args)
    //main method
    {
        draw_rec d = new draw_rec();
        JFrame f = new JFrame ("draw_rec");
        f.add(d);
        f.setSize(400,400);
        //sets size
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}