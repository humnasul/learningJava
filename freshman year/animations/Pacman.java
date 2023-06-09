
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GraphicsEnvironment;
//imports
/**
 * Name: Humna Sultan
 * Program Name: 9.2 Pacman
 * Date: 31 May 2019
 * Extra Thing: Random fact about pacman ***Adrianna told me
 that it was not necessary to put the PacMan in the heading
 */
public class Pacman extends JPanel {
    //class name
    public void paintComponent(Graphics g)
    //method
    {
        super.paintComponent(g);
        Font arial30 = new Font("Arial", Font.BOLD, 60);
        Font arial5 = new Font("Arial", Font.BOLD, 15);
        //creates new font for use with strings
        g.setColor(Color.blue);

        g.fillRect(0, 0, 600, 600);
        //sets background
        g.setFont(arial30);
        g.setColor(Color.white);
        g.drawString("PACMAN", 150, 100);
        //sets font and prints pacman
        g.setColor(Color.red);
        g.drawArc(120, 125, 40, 70, 0, 180);
        g.setColor(Color.red);
        g.fillArc(120, 125, 40, 70, 0, 180);
        //red ghost
        g.setColor(Color.white);
        g.drawOval(140, 135, 10, 15);
        g.fillOval(140, 135, 10, 15);
        g.drawOval(127, 135, 10, 15);
        g.fillOval(127, 135, 10, 15);
        g.setColor(Color.black);
        g.drawOval(145, 140, 5, 8);
        g.fillOval(145, 140, 5, 8);
        g.drawOval(132, 140, 5, 8);
        g.fillOval(132, 140, 5, 8);
        //prints eyes for ghost
        g.setColor(Color.yellow);
        g.drawOval(360, 175, 35, 35);
        g.fillOval(360, 175, 35, 35);
        g.setColor(Color.blue);
        g.fillArc(353, 150, 45, 95, -5, 20);
        //prints pacman
        g.setColor(Color.white);
        g.fillOval(410, 180, 20, 20);
        //prints pellet

        for(int i = 0; i < 4; i++)
        {
            if (i == 0)
            {
                g.setColor(Color.orange);
                g.drawArc(120, 175, 40, 70, 0, 180);
                g.fillArc(120, 175, 40, 70, 0, 180);
                g.setColor(Color.white);
                g.drawOval(140, 185, 10, 15);
                g.fillOval(140, 185, 10, 15);
                g.drawOval(127, 185, 10, 15);
                g.fillOval(127, 185, 10, 15);
                g.setColor(Color.black);
                g.drawOval(145, 193, 5, 8);
                g.fillOval(145, 193, 5, 8);
                g.drawOval(132, 193, 5, 8);
                g.fillOval(132, 193, 5, 8);
                //prints orange ghost with eyes
            }
            if (i == 1)
            {
                g.setColor(Color.cyan);
                g.drawArc(180, 175, 40, 70, 0, 180);
                g.fillArc(180, 175, 40, 70, 0, 180);
                g.setColor(Color.white);
                g.drawOval(200, 185, 10, 15);
                g.fillOval(200, 185, 10, 15);
                g.drawOval(187, 185, 10, 15);
                g.fillOval(187, 185, 10, 15);
                g.setColor(Color.black);
                g.drawOval(205, 193, 5, 8);
                g.fillOval(205, 193, 5, 8);
                g.drawOval(192, 193, 5, 8);
                g.fillOval(192, 193, 5, 8);
                //prints blue ghost with eyes
            }
            if (i == 2)
            {
                g.setColor(Color.green);
                g.drawArc(240, 175, 40, 70, 0, 180);
                g.fillArc(240, 175, 40, 70, 0, 180);
                g.setColor(Color.white);
                g.drawOval(260, 185, 10, 15);
                g.fillOval(260, 185, 10, 15);
                g.drawOval(247, 185, 10, 15);
                g.fillOval(247, 185, 10, 15);
                g.setColor(Color.black);
                g.drawOval(265, 193, 5, 8);
                g.fillOval(265, 193, 5, 8);
                g.drawOval(252, 193, 5, 8);
                g.fillOval(252, 193, 5, 8);
                //prints green ghost with eyes
            }
            if (i == 3)
            {
                g.setColor(Color.red);
                g.drawArc(300, 175, 40, 70, 0, 180);
                g.fillArc(300, 175, 40, 70, 0, 180);
                g.setColor(Color.white);
                g.drawOval(320, 185, 10, 15);
                g.fillOval(320, 185, 10, 15);
                g.drawOval(307, 185, 10, 15);
                g.fillOval(307, 185, 10, 15);
                g.setColor(Color.black);
                g.drawOval(325, 193, 5, 8);
                g.fillOval(325, 193, 5, 8);
                g.drawOval(312, 193, 5, 8);

                g.fillOval(312, 193, 5, 8);
                //prints red ghost with eyes
            }
        }
        int x = 35;
        for (int k= 0; k < 5; k++)
        {
            if (k == 0)
            {
                g.setColor(Color.black);
            }
            if(k == 1)
            {
                g.setColor(Color.white);
            }
            if (k== 2)
            {
                g.setColor(Color.black);
            }
            if(k == 3)
            {
                g.setColor(Color.white);
            }
            if (k == 4)
            {
                g.setColor(Color.black);
            }
            g.drawRect(x, 300, 100, 50);
            g.fillRect(x, 300, 100, 50);
            x += 100;
        }
        //prints first row of checkerboard
        x = 35;
        for (int k= 0; k < 5; k++)
        {
            if (k == 0)
            {

                g.setColor(Color.white);
            }
            if(k == 1)
            {
                g.setColor(Color.black);
            }
            if (k== 2)
            {
                g.setColor(Color.white);
            }
            if(k == 3)
            {
                g.setColor(Color.black);
            }
            if (k == 4)
            {
                g.setColor(Color.white);
            }
            g.drawRect(x, 350, 100, 50);
            g.fillRect(x, 350, 100, 50);
            x += 100;
        }
        //prints second row of checkerboard
        x = 35;
        for (int k= 0; k < 5; k++)
        {
            if (k == 0)
            {
                g.setColor(Color.black);
            }
            if(k == 1)
            {
                g.setColor(Color.white);
            }
            if (k== 2)
            {
                g.setColor(Color.black);
            }

            if(k == 3)
            {
                g.setColor(Color.white);
            }
            if (k == 4)
            {
                g.setColor(Color.black);
            }
            g.drawRect(x, 400, 100, 50);
            g.fillRect(x, 400, 100, 50);
            x += 100;
        }
        //prints third row of checkerboard
        x = 35;
        for (int k= 0; k < 5; k++)
        {
            if (k == 0)
            {
                g.setColor(Color.white);
            }
            if(k == 1)
            {
                g.setColor(Color.black);
            }
            if (k== 2)
            {
                g.setColor(Color.white);
            }
            if(k == 3)
            {
                g.setColor(Color.black);
            }
            if (k == 4)
            {
                g.setColor(Color.white);
            }
            g.drawRect(x, 450, 100, 50);
            g.fillRect(x, 450, 100, 50);

            x += 100;
        }
        //prints fourth row of checkerboard
        x = 35;
        for (int k= 0; k < 5; k++)
        {
            if (k == 0)
            {
                g.setColor(Color.black);
            }
            if(k == 1)
            {
                g.setColor(Color.white);
            }
            if (k== 2)
            {
                g.setColor(Color.black);
            }
            if(k == 3)
            {
                g.setColor(Color.white);
            }
            if (k == 4)
            {
                g.setColor(Color.black);
            }
            g.drawRect(x, 500, 100, 50);
            g.fillRect(x, 500, 100, 50);
            x += 100;
        }
        //prints fifth row of checkerboard
        g.setColor(Color.red);
        g.drawArc(55, 307, 40, 70, 0, 180);
        g.setColor(Color.red);
        g.fillArc(55, 307, 40, 70, 0, 180);
        g.setColor(Color.white);

        g.drawOval(75, 317, 10, 15);
        g.fillOval(75, 317, 10, 15);
        g.drawOval(62, 317, 10, 15);
        g.fillOval(62, 317, 10, 15);
        g.setColor(Color.black);
        g.drawOval(80, 322, 5, 8);
        g.fillOval(80, 322, 5, 8);
        g.drawOval(68, 322, 5, 8);
        g.fillOval(68, 322, 5, 8);
        //prints red ghosts in grid
        //---------------------------------------
        g.setColor(Color.pink);
        g.drawArc(155, 507, 40, 70, 0, 180);
        g.setColor(Color.pink);
        g.fillArc(155, 507, 40, 70, 0, 180);
        g.setColor(Color.white);
        g.drawOval(175, 517, 10, 15);
        g.fillOval(175, 517, 10, 15);
        g.drawOval(162, 517, 10, 15);
        g.fillOval(162, 517, 10, 15);
        g.setColor(Color.black);
        g.drawOval(180, 522, 5, 8);
        g.fillOval(180, 522, 5, 8);
        g.drawOval(168, 522, 5, 8);
        g.fillOval(168, 522, 5, 8);
        //prints pink ghost in grid
        //---------------------------
        g.setColor(Color.yellow);
        g.drawOval(455, 307, 35, 35);
        g.fillOval(455, 307, 35, 35);
        g.setColor(Color.black);
        g.fillArc(448, 282, 45, 95, -5, 20);

        //prints pacman in grid
        int number = (int) (Math.random()*3+1);
        g.setFont(arial5);
        if (number == 1)
        {
            g.setColor(Color.magenta);
            g.drawString("PacMan was inspired by pizza!", 150,

                    280);
        }
        if (number == 2)
        {
            g.setColor(Color.magenta);
            g.drawString("The highscore for PacMan is 3,333,360!", 150, 280);

        }
        if (number == 3)
        {
            g.setColor(Color.magenta);
            g.drawString("The orange ghost's name is Clyde!",

                    150, 280);
        }
        //EXTRA
    }
    public static void main(String[] args)
    //main method
    {
        Pacman d = new Pacman();
        JFrame f = new JFrame ("Pacman");
        f.add(d);
        f.setSize(600,600);
        //sets size
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}