//Alan Kelsey
//alankelsey@u.boisestate.edu

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class DrawingFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setBackground(Color.GRAY);
	    frame.setSize(300, 300);
        frame.setTitle("This is my window's title, Creative isn't it?");
        
        // This tells the JFrame to end the application when the "close"
        // button is pressed. Otherwise only the window is closed (hidden).
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // By default frames (windows) are created hidden. They need their
        // visibility set to "true" before they can be seen.
        frame.setVisible(true);
        
        // We need a panel in order to draw within the frame
	    DrawingPanel panel = new DrawingPanel();
        frame.add(panel);
	    frame.setVisible(true);
    }
}
