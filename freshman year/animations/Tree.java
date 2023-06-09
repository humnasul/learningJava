
import java.awt.*;
import javax.swing.*;
//import
/**
 * Name: Humna Sultan
 * Program Name: 9.5 Repeat
 * Date: 9 June 2019
 * Extra Thing: Tree has diffent colors
 */
public class Tree extends JPanel
{
    //class name
    public void paintComponent(Graphics g)
    //method
    {
        super.paintComponent(g);
        Color Brown = new Color (165, 42, 42);
        Color G_reen= new Color (0, 225, 56);
        Color G_reen1= new Color (0, 200, 56);
        Color G_reen2= new Color (0, 175, 56);
        Color G_reen3= new Color (0, 150, 56);
        Color G_reen4= new Color (0, 125, 56);
        //diff colors
        setBackground(Color.WHITE);
        g.setColor(Brown);
        g.fillRect(150, 150, 50, 65);
        int [ ] x = {175, 225, 125};
        int [ ] y = {100, 150, 150};
        int [ ] x1 = {175, 225, 125};

        int [ ] y1 = {80, 130, 130};
        int [ ] x2 = {175, 225, 125};
        int [ ] y2 = {60, 110, 110};
        int [ ] x3 = {175, 225, 125};
        int [ ] y3 = {40, 90, 90};
        int [ ] x4 = {175, 225, 125};
        int [ ] y4= {20, 70, 70};
        //different arrays for diff parts of tree
        g.setColor(Color.black);
        for (int i = 0; i <= 4; i++)
        //for loop for drawing repetitive shapes
        {
            switch(i)
            //switch statement that determines array and color used perlayer
            {
                case(0):
                {
                    g.setColor(G_reen);
                    g.drawPolygon(x, y, 3);
                    g.fillPolygon(x, y, 3);
                    break;
                }
                case(1):
                {
                    g.setColor(G_reen1);
                    g.drawPolygon(x1, y1, 3);
                    g.fillPolygon(x1, y1, 3);
                    break;
                }
                case(2):
                {
                    g.setColor(G_reen2);
                    g.drawPolygon(x2, y2, 3);
                    g.fillPolygon(x2, y2, 3);
                    break;
                }
                case(3):
                {

                    g.setColor(G_reen3);
                    g.drawPolygon(x3, y3, 3);
                    g.fillPolygon(x3, y3, 3);
                    break;
                }
                case(4):
                {
                    g.setColor(G_reen4);
                    g.drawPolygon(x4, y4, 3);
                    g.fillPolygon(x4, y4, 3);
                    break;
                }

            }

        }
    }
    public static void main (String[] args)
    //main method
    {
        Tree p = new Tree();
        JFrame frm = new JFrame("Tree");
        frm.setSize (300,300);
        //sets size
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.add(p);
        frm.setVisible(true);
    }
}
