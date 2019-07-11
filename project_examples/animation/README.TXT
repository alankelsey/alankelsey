import java.awt.*;
import javax.swing.*;

public class JavaArt extends JApplet
{
    public void init()
    {
        JRootPane rootPane = this.getRootPane();
        rootPane.putClientProperty("defeatSystemEventQueueCheck",
            Boolean.TRUE);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.red);
         g.fillRect(100, 200, 150, 150);
        int [] xList = new int [3] ;
        int [] yList = new int [3] ;
        int pointCount = 3;
        xList [0] = 75;
        xList [1] = 175;
        xList [2] = 275;
        yList [0] = 200;
        yList [1] = 125;
        yList [2] = 200;
        g.setColor(Color.green);
        g.fillPolygon(xList, yList, pointCount);
        g.setColor(Color.black);
        g.fillRect(120, 220, 35, 35);
        g.setColor(Color.blue);
        g.fillRect(175, 275, 50, 75);
        g.setColor(Color.yellow);
        g.fillOval(275, 50, 75, 75);
        g.fillOval(180, 310, 5, 5);
    }
}------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:
