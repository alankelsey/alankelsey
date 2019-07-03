//Alan Kelsey
//alankesley@u.boisestate.edu

import java.awt.*;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel
{

	public void paintComponent(Graphics pen)
	{	
	
	//Start Sun	
 	pen.setColor(Color.ORANGE);
        pen.fillArc(190, -110, 220, 220, -180,90 );
	
	//Start house
	pen.setColor(Color.GREEN);
	pen.fillRect(20, 140, 90, 10); //roof
	pen.setColor(Color.RED);
	pen.fillRect(30, 150, 70, 80); //house
	pen.setColor(Color.WHITE);
	pen.drawRect(40, 160, 20, 20); //window
	pen.drawRect(70, 200, 20, 30);//door trim
	pen.setColor(Color.LIGHT_GRAY);
	pen.fillRect(71,201, 19, 29); //door

	//build ocean around house
	pen.setColor(Color.BLUE);
	pen.fillRect(0, 200, 30, 10);
	pen.fillRect(100, 200, 200, 10);

	//build sand around house
	pen.setColor(Color.YELLOW);
	pen.fillRect(0, 210, 30, 20);
	pen.fillRect(100, 210, 200, 30);
	pen.fillRect(0, 230, 300, 70);
	
	//Build boat
	pen.setColor(Color.BLACK);
	pen.drawRect(190, 170, 10, 10); //top
	pen.drawRect(180, 180, 30, 10); //middle
	pen.drawLine(170, 190, 220, 190); //bottom line
	pen.drawLine(170, 190, 180, 200); //bottom side slant left
	pen.drawLine(220, 190, 210, 200); // bottom sides slant right 

	//Draw name in oval
	pen.drawOval(160, 160, 80 ,50);
        pen.setFont(new Font("Helvetica", Font.BOLD, 20));
        pen.drawString("Alan Kelsey", 110, 260);

	}
}


