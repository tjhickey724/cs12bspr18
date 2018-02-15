import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RoundRectShape extends Shape {
				// This class represents rectangle shapes with rounded corners.
				// (Note that it uses the inherited version of the
				// containsPoint(x,y) method, even though that is not perfectly
				// accurate when (x,y) is near one of the corners.)
		void draw(Graphics g) {
				g.setColor(color);
				g.fillRoundRect(left,top,width,height,width/3,height/3);
				g.setColor(Color.black);
				g.drawRoundRect(left,top,width,height,width/3,height/3);
		}
}
