import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RectShape extends Shape {
				// This class represents rectangle shapes.
		void draw(Graphics g) {
				g.setColor(color);
				g.fillRect(left,top,width,height);
				g.setColor(Color.black);
				g.drawRect(left,top,width,height);
		}
}
