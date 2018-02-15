import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OvalShape extends Shape {
				// This class represents oval shapes.
		void draw(Graphics g) {
				g.setColor(color);
				g.fillOval(left,top,width,height);
				g.setColor(Color.black);
				g.drawOval(left,top,width,height);
		}
		boolean containsPoint(int x, int y) {
						// Check whether (x,y) is inside this oval, using the
						// mathematical equation of an ellipse.  This replaces the
						// definition of containsPoint that was inherited from the
						 // Shape class.
				double rx = width/2.0;   // horizontal radius of ellipse
				double ry = height/2.0;  // vertical radius of ellipse
				double cx = left + rx;   // x-coord of center of ellipse
				double cy = top + ry;    // y-coord of center of ellipse
				if ( (ry*(x-cx))*(ry*(x-cx)) + (rx*(y-cy))*(rx*(y-cy)) <= rx*rx*ry*ry )
						return true;
				else
						return false;
		}
}
