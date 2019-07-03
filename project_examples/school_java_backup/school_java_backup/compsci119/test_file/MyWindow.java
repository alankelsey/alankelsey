//Alan Kelsey
//akelsey@u.boisestate.edu
//

import javax.swing.JFrame;

public class MyWindow
{

    public static void main(String[] args)
    {
    
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setTitle("This is my window title");

        //This tells the JFrame to end the application when the "close"
        //button is pressed. Otherwise only the window is closed (hidden).
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //By default frames (windows) are hidden. They neeed their 
        //visibility set to "true" before they can be seen.
        frame.setVisible(true);

        //We need a panel in order to draw wihin the frame
        MyPanel panel = new MyPanel();
        frame.add(panel);

    }
}
